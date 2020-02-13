package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.UserDao;
import com.example.demo.daoImpl.UserDaoImpl;
import com.example.demo.entity.User;
import com.example.demo.repos.UserRepository;

@Controller
public class UserController {

	@Autowired
	private ModelAndView mdlView;

	@Autowired
	private UserRepository repo;

	@Autowired
	private User user;
	
	
	@Autowired
	private UserDaoImpl userdaoimpl;
	
	@Autowired
	private UserDao userdao;

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
	public String initForm(Model model) {
		model.addAttribute("command", user);
		return "login";
	}

	@PostMapping(path = "/login")
	public String checklogin(@ModelAttribute("command") User user) {
		String nextPage="login";
		
		int j= this.userdaoimpl.loginUser(user);
		
		if(j==1) {
			nextPage="adminhome";	
		}
		else if(j==2){
			nextPage="userhome";
		}
		return nextPage;
	}
	@GetMapping("/register")
	public String initRegisterForm(Model model) {
		model.addAttribute("command", user);
		return "register";
	}
	
	@PostMapping("/register")
	public String registerUser(@ModelAttribute("command") User user) {
		System.out.println("-=-=-=====-=-=== User = "+user);
		String nextPage="index";
		this.repo.save(user);
		return nextPage;
		
	}

//	@GetMapping(path = "/viewUser")
//	public ModelAndView findAll() {
//		mdlView.setViewName("viewUser");
//		mdlView.addObject("list", repo.findAll());
//		return mdlView;
//	}

}
