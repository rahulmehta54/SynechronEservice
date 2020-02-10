package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.Setter;

@Controller
@Setter
public class WelcomeController {
	
	@Autowired
	private ModelAndView mdlView;
	
	@GetMapping("/")
	public ModelAndView init()
	{
		System.out.println("inside init method");
		mdlView.setViewName("index");
		mdlView.addObject("mainheading", "sai travel agency");
		
		return mdlView;
		
	}

}
