package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Service;
import com.example.demo.repos.ServiceRepository;

public class ServiceController {

	private ModelAndView mdlView;
	
	private ServiceRepository servicerepo;
	
    private Service service;
    
	@GetMapping(path = "/")
	public ModelAndView init() {
		mdlView.setViewName("index");
		// System.out.println("indis");
		mdlView.addObject("mainheading", "E-Services");
		return mdlView;

	}
}
