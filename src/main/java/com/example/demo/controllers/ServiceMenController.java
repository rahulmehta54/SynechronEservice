package com.example.demo.controllers;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.ViewServiceMen;
import com.example.demo.entity.ServiceMen;
import com.example.demo.entity.User;
import com.example.demo.repos.ServiceMenRepository;


import lombok.Setter;

@Controller
@Setter
public class ServiceMenController {

	@Autowired
	private ServiceMenRepository srepo;
	
	@Autowired
	private ViewServiceMen vsm;
	
	@Autowired
	private ServiceMenRepository repo;
	
	@Autowired
	private ModelAndView mdlView;
	
	@GetMapping(path="/adminMenu")
	public String showAdminMenu() {
		return "adminMenu";
	}
	@GetMapping(path="/addServiceMen")
	public String showAddServiceMenPage() {
		return "addServiceMen";
	}
	
	@PostMapping(path="/addServiceMen")
	public String onSubmit(Model model, @Valid @ModelAttribute("command") ServiceMen smen) {
		srepo.save(smen);
		model.addAttribute("addSuccessful", "Service Man Added Successfully!");
		return "adminMenu";
	}

	@GetMapping(path = "/viewServiceMen")
	public String findAll(Model model) {
		
		List<ServiceMen> serviceMenList =repo.findAll();
		model.addAttribute("serviceMenList", serviceMenList);
		return "viewServiceMen" ;
	}
	@GetMapping(path="/editServiceMen")
	public ModelAndView showEditPage(Model model, @ModelAttribute("command") int id) {
		Optional<ServiceMen> serviceMenList =repo.findById(id);
		mdlView.addObject("serviceMenList", serviceMenList);
		mdlView.setViewName("editServiceMen");
		return mdlView;
  }	
//	public String showEditServicePage() {
//		return "editServiceMen";
//	}
	
}


