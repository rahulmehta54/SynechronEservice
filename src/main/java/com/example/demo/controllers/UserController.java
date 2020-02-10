package com.example.demo.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.User;
import com.example.demo.repos.UserRepository;

import lombok.Setter;

@Controller
@Setter
public class UserController {

	@Autowired
	private UserRepository repo;
	
	
	@Autowired
	private User user;
	
	@GetMapping(path="/signUp")
	public String initForm(Model model) {
		model.addAttribute("command", user);
		return "signUp";
	}
	
	@PostMapping(path="/signUp")
	public String onSubmit(@Valid @ModelAttribute("command") User user) {
		repo.save(user);
		return "regSuccessful";
	}
}
