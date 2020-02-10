package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.ServiceProviderInfo;
import com.example.demo.entity.UserInfo;

@Controller
public class LoginController {

	@Autowired
	private UserInfo userInfo ;
	
	@Autowired
	private ServiceProviderInfo serviceProviderInfo ;
	
	
	@GetMapping(path = "/userLogin")
	public String nextUserJSP(Model model)
	{
		//command has request scope
		model.addAttribute("command", userInfo);
		return "userLogin";
		
	}
	
	@GetMapping(path = "/adminLogin")
	public String nextAdminJSP(Model model)
	{
		//command has request scope
		model.addAttribute("command", serviceProviderInfo);
		return "serviceProviderInfo";
		
	}
	
}



