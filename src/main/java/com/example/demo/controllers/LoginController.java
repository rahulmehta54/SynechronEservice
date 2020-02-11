package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.User;
import com.example.demo.services.LoginService;

import lombok.Setter;

@Controller
@Setter
public class LoginController {

	@Autowired
	private ModelAndView mdlView;
	@Autowired
	private LoginService loginservice;
	@Autowired
	private User user;

	
	
	@GetMapping("/")
	public ModelAndView init() {
		
		mdlView.setViewName("login");
		return mdlView;
		
	}
	
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String showMenuPage(Model model,User u) {
		System.out.println(u.getFirstName());
		if(loginservice.isValidUser(u.getEmailId(),u.getPwd())) {
			model.addAttribute("firstName", u.getFirstName());
			
			return "menu";			
		}else {
			return "login";
		}
		
		
	}

	
	  @GetMapping(path="/signUp") public String showSignUpPage(Model model) {
	  
	  return "signUp"; }
	 
	  @GetMapping(path="/login") public String showLoginPage(Model mdl) {
		  return "login";
	  }
	
}
