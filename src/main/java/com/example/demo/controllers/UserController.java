package com.example.demo.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Users;
import com.example.demo.repo.userRepository;
import com.example.demo.services.userServiceImpl;

@Controller
public class UserController {

	@Autowired
	Users u;
	
	@Autowired
	userServiceImpl userv;
	
	
	
	@GetMapping(path="/login")
	public String loginPage() {
		return "login";
	}
	
	@GetMapping(path="/admin")
	public String adminLoginPage() {
		return "admin";
	}
	
	
	@GetMapping(path = "/Register") 
	  public String initRegistrForm(Model model) //it will send a form 
	  { 
		  model.addAttribute("command",u); 
		  return "Register"; //name of jsp page 
	  }
	
	@GetMapping(path="/paymentModule")
	public String paymentModule() {
		return "paymentModule";
	}
	
	 @PostMapping(path="/validateAdminLogin") 
	  public String onAdminLogin(@Valid @ModelAttribute("command") Users uu, BindingResult result)
	  {
		
		  System.out.println("piu");
		   u=userv.checkUser(uu);
			if(u!=null)
			{
				System.out.println(u.getRole());
				if(u.getRole().equals("admin"))
					return "adminOperation";
				else
					return "index";
			}
			else
				return "admin";

		  
	  }
}
