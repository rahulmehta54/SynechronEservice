package com.example.demo.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Address;
import com.example.demo.entity.ServiceProvider;

import com.example.demo.entity.Users;
import com.example.demo.repo.userRepository;
import com.example.demo.services.userServiceImpl;

@Controller
public class UserController {

	@Autowired
	Users u;
	@Autowired
	Address address;

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
		model.addAttribute("address",address);
		return "Register"; //name of jsp page 
	}

	@PostMapping(path="/RegisterUser")
	public String onRegister(@Valid @ModelAttribute("command") Users u,Model m, @ModelAttribute("address") Address addr) {
		
		
		u.setAddrr(addr);
		
		System.out.println(u);
		System.out.println(addr);
		Address a=userv.registerAddress(addr);
		u.setAddrr(a);
		
		System.out.println("address "+u.getAddrr().getCity());

		u = userv.regUser(u); if(u!=null) {
			
			System.out.println("serviceProviderName: " +u.getFirstName());
			System.out.println("success registration"); m.addAttribute("success",
					"success registration"); return "login"; } else m.addAttribute("fail",
							"fail to register"); return "Register";


	}

	@GetMapping(path="/paymentModule")
	public String paymentModule() {
		return "paymentModule";
	}

	@PostMapping(path="/validateAdminLogin") 
	public String onAdminLogin(@Valid @ModelAttribute("command") Users u, Model m)
	{

		System.out.println("piu");
	
		u=userv.checkUser(u);
		if(u!=null)
		{
			System.out.println(u.getRole());
			if(u.getRole().equals("admin"))
				return "adminOperation";
			else
				m.addAttribute("fail","You are not an authenticate user!!");
			return "index";
		}
		else
			m.addAttribute("fail","Incorrect username or Password form admin!!");
		return "admin";


	}

	@PostMapping(path="/validateUserLogin") 
	public String validateUserLogin(@Valid @ModelAttribute("command") Users u, Model m,HttpSession session)
	{

		//System.out.println(uu.getMailId());
		u=userv.checkUser(u);
		System.out.println("from controller: " +u.getContactNum());
		if(u!=null)
		{
			session.setAttribute("userSession", u);
			System.out.println(u.getRole());
			if(u.getRole().equals("user"))
				return "userOperation";
		}
		else
		{
			m.addAttribute("fail","Incorrect username or Password!!");
		    return "login";
		}
		
		return "ïndex";


	}

	@GetMapping(path="/userOperation")
	public String search(@RequestParam String keyword, Model m)
	{
		System.out.println("search: "+keyword);
		List<ServiceProvider> slist = userv.search(keyword);
		System.out.println(slist.size());
		m.addAttribute("listOfService", slist);
		return "userOperation";
	}





}
