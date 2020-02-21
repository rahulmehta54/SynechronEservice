package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.UserDao;
import com.example.demo.daoImpl.UserDaoImpl;
import com.example.demo.entity.Cart;
import com.example.demo.entity.ServiceMen;
import com.example.demo.entity.User;
import com.example.demo.repos.CartRepository;
import com.example.demo.repos.ServiceRepository;
import com.example.demo.repos.UserRepository;

@Controller
public class UserController {

	@Autowired
	private ModelAndView mdlView;

	@Autowired
    Cart cart;
	@Autowired
	private UserRepository repo;

	@Autowired
	private User user;

	@Autowired
	private UserDaoImpl userdaoimpl;

	@Autowired
	private UserDao userdao;

	@Autowired
	private ServiceRepository servicerepo;

	@Autowired
	private CartRepository cartrepo;

	@GetMapping(path = "/")
	public ModelAndView init() {
		mdlView.setViewName("index");
		mdlView.addObject("mainHeading", "E-Services");
		return mdlView;
	}

	/*
	 * @GetMapping(path = "/login") public String initForm(Model model) {
	 * model.addAttribute("command", user); return "login"; }
	 */

	@GetMapping("/login")
	public String openLoginForm(Model model) {
		model.addAttribute("command", user);
		return "login";
	}

	/*
	 * @PostMapping(path = "/login") public String
	 * checklogin(@ModelAttribute("command") User user,HttpSession session) { String
	 * nextPage="login";
	 * 
	 * 
	 * int j= this.userdaoimpl.loginUser(user);
	 * 
	 * if(j==1) { nextPage="adminhome"; } else if(j==2){ nextPage="userhome"; }
	 * return nextPage; }
	 */

	@GetMapping("/register")
	public String openRegisterForm(Model model) {
		model.addAttribute("command", user);
		return "register";
	}

	@PostMapping("/register")
	public String registerUser(@ModelAttribute("command") User user) {
		System.out.println("-=-=-=====-=-=== User = " + user);
		String nextPage = "index";
		this.repo.save(user);
		return nextPage;

	}

	@PostMapping("/login")
	public String onSubmitForm(@Valid @ModelAttribute("command") User user, HttpSession session) {

		User userData = userdaoimpl.getDataofUser(user);
		System.out.println("userdata ======" + userData);
		session.setAttribute("userdata", userData);
//		session.setAttribute("submit", userDaoImpl.getDataOfUser(user));

		String nextPage = "login";
		int i = this.userdaoimpl.loginUser(user);
		if (i == 1) {
			nextPage = "adminhome";
		} else if (i == 2) {
			nextPage = "userhome";
		}
		return nextPage;
	}

	@GetMapping("/viewCart/{service_Id}")
	public ModelAndView addToCart(Model model, @PathVariable("service_Id") int service_Id,
			HttpSession session) {
		System.out.println("" + service_Id);
		User user = (User) session.getAttribute("userdata");
		ServiceMen s = servicerepo.getOne(service_Id);

		
		cart.setServicemenName(s.getsFName());
		cart.setMob(s.getMob());
		cart.setCategory(s.getCategory());
		cart.setCity(s.getCity());
		cart.setInspectionRate(s.getInspectionRate());
		cartrepo.saveAndFlush(cart);

		mdlView.setViewName("viewCart");
		//System.out.println("view cart listing");
		
		List<Cart> cartlist=new ArrayList<>();
		cartlist.add(cart);
		mdlView.addObject("list",cartlist);
		return mdlView;
	//	return new ResponseEntity<String>("success", HttpStatus.OK);
		
		
	}

	/*
	 * @GetMapping(path = "/viewUser") public ModelAndView findAll() {
	 * mdlView.setViewName("viewUser"); mdlView.addObject("list", repo.findAll());
	 * return mdlView; }
	 */

//	@GetMapping("/showCartList")
//	public ModelAndView showCartList() {
//		mdlView.setViewName("viewCart");
//		System.out.println("view cart listing");
//		mdlView.addObject("list", servicerepo.findAll());
//		return mdlView;
//	}

}
