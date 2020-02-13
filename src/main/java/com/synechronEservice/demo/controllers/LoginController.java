package com.synechronEservice.demo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.synechronEservice.demo.dao.LoginInterface;
import com.synechronEservice.demo.dao.ServiceProviderInterface;
import com.synechronEservice.demo.models.ServiceProvider;
import com.synechronEservice.demo.models.Users;
import com.synechronEservice.demo.services.LoginServices;

import net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition.Undefined;

@Controller
@SessionAttributes("name")
public class LoginController {

	@Autowired
	Users user;
	@Autowired
	LoginServices service;
	@Autowired
	ModelAndView mdlview;
	@Autowired
	LoginInterface loginiterface;
	@Autowired
	ServiceProviderInterface srvcprointr;
	
	
	
   @GetMapping("/")
	private String loginUser(Model model) {
	   return "index";
	}
   
   
   @RequestMapping(value="/login", method = RequestMethod.POST)
   public String showWelcomePage(ModelMap model, @RequestParam String emailIId, @RequestParam String password){
       
	   boolean isValidUser = service.isAuthUser(emailIId, password);
       if (!isValidUser) {
           model.put("errorMessage", "Invalid Credentials");
           return "index";
       }else {
    	   model.put("name", emailIId);
           if(service.isAdmin(emailIId,password)) {
        	   List <ServiceProvider> getUserList=srvcprointr.findAll();
        	   model.put("serviceproviderList", getUserList);
        	   return "adminPage";
    	   }else {
    		   return "userPage";
    	   }
       }
      
   }
   
   @GetMapping("/signup")
  	private ModelAndView  signUpUser(Model command) {
	   return new ModelAndView("signupPage","command",new Users()); 
    
  	}
  
   @RequestMapping(value = "/signup", method = RequestMethod.POST)
 	private ModelAndView registerUser(ModelMap model,@ModelAttribute("user") Users user) {
	   
 	   if(loginiterface.save(user) != null) {
 		  model.put("succesfull", "Succefully Added");
          return new ModelAndView("signupPage","command",new Users());
 	   }else {
 		  model.put("error", "Please Enter All Detail");
 		 return new ModelAndView("signupPage","command",new Users());
 	   }
 	   
 	}
}
