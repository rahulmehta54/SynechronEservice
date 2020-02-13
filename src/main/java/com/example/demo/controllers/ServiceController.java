package com.example.demo.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Service;
import com.example.demo.repos.ServiceRepository;

@Controller
public class ServiceController {

	private ModelAndView mdlView;

	@Autowired
	private ServiceRepository servicerepo;

	@Autowired
	private Service service;
	
	@GetMapping("/addServiceMen")
	public String initRegisterForm(Model model) {
		model.addAttribute("command", service);
		return "addServiceMen";
	}
	
	@PostMapping("/addServiceMen")
		public String checkService(@ModelAttribute("command") Service service) {
			String nextpage="viewservicemen";
			this.servicerepo.save(service);
			return "viewservicemen";
			
		}
	}

//	@GetMapping(path = "/addService")
//	public String addservice(Model model) {
//
//		this.servicerepo.save(this.service);
//
//		model.addAttribute("element", this.service);
//
//		return "success";
//	}

	
//	@GetMapping(path = "/viewService")
//	public ModelAndView findAll() {
//		mdlView.setViewName("viewService");
//		mdlView.addObject("list", servicerepo.findAll());
//		return mdlView;
//	}

