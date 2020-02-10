package com.example.demo.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

//import com.example.demo.controllers;
import com.example.demo.entity.User;
import com.example.demo.repos.UserRepository;

public class UserController {

	@Autowired
	private ModelAndView mdlView;
	
	@Autowired
	private UserRepository repo;
	
	@Autowired
	private User user;
	
	@GetMapping(path = "/")
	public ModelAndView init() {
		mdlView.setViewName("index");
		// System.out.println("indis");
		mdlView.addObject("mainheading", "E-Services");
		return mdlView;

	}
	@GetMapping(path = "/addUser")
	public String initForm(Model model) {
		model.addAttribute("command", user);
		return "addUser";

	}
	@PostMapping(path = "/addUser")
	public String onsubmit(@Valid @ModelAttribute("command") User user) {

		repo.save(user);
		return "success";
	}

	@GetMapping(path = "/viewUser")
	public ModelAndView findAll() {
		mdlView.setViewName("viewUser");
		mdlView.addObject("list", repo.findAll());
		return mdlView;
	}

	
}
