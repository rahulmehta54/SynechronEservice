package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.services.LoginService;

import lombok.Setter;

@Controller
@Setter
public class LoginController {

	@Autowired
	private ModelAndView mdlView;
	@Autowired
	private LoginService loginservice;

	
	
	@GetMapping("/")
	public ModelAndView init() {
		
		mdlView.setViewName("login");
		return mdlView;
		
	}
	
	/*
	 * @GetMapping("/") public String loginPage() {
	 * 
	 * return "login"; }
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String showMenuPage(ModelMap model, @RequestParam String emailId, @RequestParam String pwd) {
		
		if(loginservice.isValidUser(emailId,pwd)) {
			return "menu";
		}else {
			return "login";
		}
		
		
	}
	
}
