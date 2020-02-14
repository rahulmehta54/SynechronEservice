package com.eservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.Setter;

@Controller
@Setter
public class WelcomeController {

	@Autowired
	private ModelAndView modelAndView;
	
	@GetMapping("/")
	public ModelAndView  init() {
		modelAndView.setViewName("index");
		modelAndView.addObject("mainHeading", "Welcome To Syne-E-Services");
		return modelAndView;
	}	
}