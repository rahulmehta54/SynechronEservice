package com.example.demo.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.daoImpl.UserDaoImpl;
import com.example.demo.entity.User;
import com.example.demo.repos.UserRepository;

@Controller
public class UserController {

	@Autowired
	private User user;

	@Autowired
	private UserRepository user_repository;

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
	public String onSubmitForm(@Valid @ModelAttribute("command") User user) {
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
		
		System.out.println("111111");
		
		String nextPage = "index";
		this.user_repository.save(user);
		return nextPage;
	}

}
