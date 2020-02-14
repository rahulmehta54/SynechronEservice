package com.eservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.eservice.model.User;
import com.eservice.repository.UserRepo;
import com.eservice.service.UserService;

@Controller
public class RegisterController {

	@Autowired
	private User user;
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/register")
	public String initForm(Model model) {
		model.addAttribute("command", user);
		return "register";
	}
	
	@PostMapping("/register")
	public String onSubmit(@ModelAttribute ("command") User user) {
		//System.out.println("============================="+ user.getUserName());
		userService.onSubmit(user);
		return "index";
		
	}

}