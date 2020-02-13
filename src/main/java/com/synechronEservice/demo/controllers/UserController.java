package com.synechronEservice.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.synechronEservice.demo.models.ServiceProvider;
import com.synechronEservice.demo.services.AdminServices;
import com.synechronEservice.demo.services.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userservice;
	@Autowired
	AdminServices adminservice;
	@RequestMapping(value="/searchProvider", method = RequestMethod.POST)
	public String showSerchResult(ModelMap model,@RequestParam String service, @RequestParam String location){
		List<ServiceProvider> li =userservice.getDetailsOnTheBasis(service,location);
		
		 model.put("serviceproviderList", li);
		 model.put("service", service);
		 model.put("city", location);
		return "providerList";
	}
	
	@RequestMapping(value = "addTocart/{serviceId}", method=RequestMethod.GET)
    public  ModelAndView getAttr(@PathVariable(value="serviceId") int id,ModelMap model) {
		ServiceProvider serProv=adminservice.getProviderDetailUsingId(id);
		 
		 return new ModelAndView("editServiceProvider","command",serProv);
	}
}
