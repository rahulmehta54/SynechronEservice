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
	   
		return "index";
	}
   
   @RequestMapping(value="/login", method = RequestMethod.POST)
   public String showWelcomePage(ModelMap model, @RequestParam String emailIId, @RequestParam String password){
  
	   System.out.println(emailIId+" "+password);
	   boolean isValidUser = service.isAuthUser(emailIId, password);
       
	   if (!isValidUser) {
           model.put("errorMessage", "Invalid Credentials");
           return "index";
       }else {
    	   model.put("name", emailIId);
           if(service.isAdmin(emailIId,password)) {
        	   return "adminPage";
    	   }else {
    		   return "userPage";
    	   }
       }
      
   }
  
   
	
	
	
	
}
