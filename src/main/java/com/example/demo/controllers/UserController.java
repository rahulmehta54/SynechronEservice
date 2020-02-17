package com.example.demo.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.daoImpl.UserDaoImpl;
import com.example.demo.entity.Cart;
import com.example.demo.entity.Serviceman;
import com.example.demo.entity.User;
import com.example.demo.repos.CartRepository;
import com.example.demo.repos.ServicemanRepository;
import com.example.demo.repos.UserRepository;

@Controller
public class UserController {

	@Autowired
	private User user;

	@Autowired
	private Cart cart;

	@Autowired
	private Serviceman serviceman;

	@Autowired
	private UserRepository user_repository;

	@Autowired
	private CartRepository cartRepository;

	@Autowired
	private ServicemanRepository servicemanRepository;

	@Autowired
	private ModelAndView modelAndView;

	@Autowired
	private UserDaoImpl userDaoImpl;

	@GetMapping(path = "/")
	public ModelAndView initUser() {
		modelAndView.setViewName("index");
		modelAndView.addObject("mainHeading", "E-Services");
		return modelAndView;
	}

	@GetMapping("/login")
	public String initForm(Model model) {
		model.addAttribute("command", user);
		return "login";
	}

	@PostMapping("/login")
	public String onSubmitForm(@Valid @ModelAttribute("command") User user, HttpSession session) {

		User userData = userDaoImpl.getDataOfUser(user);
		System.out.println("userdata ======" + userData);
		session.setAttribute("submit", userData);
//		session.setAttribute("submit", userDaoImpl.getDataOfUser(user));

		String nextPage = "login";
		int i = this.userDaoImpl.loginUser(user);
		if (i == 1) {
			nextPage = "adminHome";
		} else if (i == 2) {
			nextPage = "userHome";
		}
		return nextPage;
	}

	@GetMapping("/register")
	public String initRegisterForm(Model model) {
		model.addAttribute("command", user);
		return "register";
	}

	@PostMapping("/register")
	public String onSubmitRegisterForm(@ModelAttribute("command") User user) {
		String nextPage = "index";
		this.user_repository.save(user);
		return nextPage;
	}

	@GetMapping("/addToCart/{service_Id}")
	public ModelAndView addToCart(Model model, @PathVariable("service_Id") int service_Id, HttpSession session) {
		System.out.println("" + service_Id);
//		modelAndView.addObject("service_Id", user_Id);
//		User user = (User) session.getAttribute("submit");
		Serviceman s = servicemanRepository.findById(service_Id).get();
//		addItemToCart(user,);

		modelAndView.addObject("cartList",s);
		modelAndView.setViewName("viewCart");
		return modelAndView;
	}

	/*
	 * @GetMapping("/deleteServicemanFromCart/{service_Id}") public ModelAndView
	 * deleteServicemanFromCart(@PathVariable int service_Id) {
	 * this.servicemanRepository.deleteById(service_Id);
	 * modelAndView.setViewName("userServiceman"); modelAndView.addObject("list",
	 * servicemanRepository.findAll()); return modelAndView; }
	 */

}
