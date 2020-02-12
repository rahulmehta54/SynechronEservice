package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Admin;
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
		if(loginservice.isValidUser(u.getEmailId(),u.getPwd())) {
			model.addAttribute("firstName", u.getFirstName());
			
			return "menu";			
		}else {
			model.addAttribute("error", "Invalid username/password");
			return "login";
		}
		
		
	}
	@RequestMapping(value = "/adminLogin")
	public String showAdminMenuPage(Model model,Admin a) {
		if(loginservice.isValidAdmin(a.getUserId(),a.getPwd())) {	
			return "adminMenu";			
		}
		else {
			model.addAttribute("error", "Invalid username/password");
			return "adminLogin";
		}
		
		
	}
	
	  @GetMapping(path="/signUp") public String showSignUpPage(Model model) {
	  
	  return "signUp"; }
	 
	  @GetMapping(path="/login") public String showLoginPage(Model mdl) {
		  return "login";
	  }
	  
	  @GetMapping(path="/adminLogin") public String showAdminLoginPage(Model model) {
		  return "adminLogin";
	  }
	  @PostMapping(path="adminLogin") public String showAdminMenuPage() {
		  return "adminMenu";
	  }
	
	  
}
