package com.example.demo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Service.ServiceProvider_ServiceImpl;
import com.example.demo.entity.ServiceProvider;

@Controller
public class addServicesController {

	@Autowired
	ServiceProvider_ServiceImpl spServ;
	@Autowired
	ServiceProvider sp;
	 @PostMapping(path="/RegisterServicebyAdmin")
	 public String regService(@Valid @ModelAttribute("command") ServiceProvider srvp, BindingResult result)
	 {
		
		 sp = spServ.addService(srvp);
		 
		 if(sp!=null)
		 {
			 return "adminOperations";
		 }
		 else
			 return "failure";
		 
	 }
	
	 @GetMapping("/addServices")
	 public String addServices()
	 {
		 return "addServices";
	 }
	 
	 @GetMapping(path="/viewServices")
		public String viewServices(Model model) {
		 	List<ServiceProvider> slist=spServ.viewService();
		 	model.addAttribute("servList", slist);
			return "viewServices";
		} 
	 
	
}
