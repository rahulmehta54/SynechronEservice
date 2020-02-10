package com.synechronEservice.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.synechronEservice.demo.services.LoginServices;

@Controller
@SessionAttributes("name")
public class LoginController {

	@Autowired
	LoginServices service;
	
	
   @GetMapping("/")
	private String loginUser(Model model) {
	   System.out.println("inside");
		return "index";
	}
   
   @RequestMapping(value="/login", method = RequestMethod.POST)
   public String showWelcomePage(ModelMap model, @RequestParam String name, @RequestParam String password){

       boolean isValidUser = service.validateUser(name, password);

       if (!isValidUser) {
           model.put("errorMessage", "Invalid Credentials");
           return "login";
       }
       model.put("name", name);
       model.put("password", password);

       return "welcome";
   }
  
   
	
	
	
	
}
