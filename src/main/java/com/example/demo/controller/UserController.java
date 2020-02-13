package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.daos.ServiceProviderDao;
import com.example.demo.daos.UserDao;
import com.example.demo.entity.ServiceProviderInfo;
import com.example.demo.entity.UserInfo;
import com.example.demo.repos.UserInfoRepository;


@Controller
public class UserController {

	
	@Autowired
	private UserInfo userInfo;
	
	@Autowired
	private UserInfoRepository repo;
	
	@Autowired
	private UserDao dao;
	
	@GetMapping(path = "/newUser")
	public String nextNewUserJSP(Model model)
	{
		//command has request scope
		model.addAttribute("command", userInfo);
		return "newUser";
		
	}
	
	@PostMapping("/createNewUser")
	public String saveNewUser(@ModelAttribute("command") UserInfo userInfo) {
		System.out.println("inside save new user");
		System.out.println(userInfo.getUserName());
		repo.save(userInfo);
		
	    return "success";
	}
	
	
	
	
}
