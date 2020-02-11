package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class UserController {

	@Autowired
	private User user;

	@Autowired
	private ModelAndView mdlView;

	@Autowired
	private UserDaoImpl userDaoImpl;

	@Autowired
	private UserDaoJPA userDaoJPA;

	@GetMapping("/")
	public ModelAndView init() {
		mdlView.setViewName("index");
		mdlView.addObject("mainHeading", "E-Service");
		return mdlView;
	}

	@GetMapping("/login")
	public String initForm(Model model) {
		model.addAttribute("command", user);
		return "login";
	}

	@PostMapping("/login")
	public String checkLogin(@ModelAttribute("command") User user) {
		String nextPage = "index";
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
	public String registerUser(@ModelAttribute("command") User user) {
		String nextPage = "index";
		this.userDaoJPA.save(user);
		return nextPage;
	}

}