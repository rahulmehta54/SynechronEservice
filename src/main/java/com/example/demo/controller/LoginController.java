package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.controller.repository.UserRepository;
import com.example.demo.entity.SalesPerson;
import com.example.demo.entity.User;

import lombok.Setter;


@Controller 
@Setter
public class LoginController {
	@Autowired
	private UserRepository  repo;
	@Autowired
	private ModelAndView mdlview;
	@Autowired
	private User user;
	
	
	@GetMapping(path="/")
	public ModelAndView init() {
		mdlview.setViewName("index");
		mdlview.addObject("mainheading","E-services");
		return mdlview;
		
		
	}
	@GetMapping(path="/login")
	public String initForm(Model model) {
		model.addAttribute("command",user);
		System.out.println("hello world");
		return "login";
	}



	@PostMapping(path="/login")
	private ModelAndView onSubmit(@Valid @ModelAttribute("command") User user) 
		{
		System.out.println(user.toString());
		System.out.print(user.getName()+user.getPassword()+user.getRole());
		List<User>	loggedinuser=repo.findByEmailAndPasswordAndRole(user.getEmail(),user.getPassword(),user.getRole());
		System.out.println("insidelogin"+loggedinuser.toString());
		String name="default";
		for (User user2 : loggedinuser) {
			System.out.println("foeacch"+user2.toString());
			 name=user2.getName();
		}
		
		System.out.println("aaya");
			if(!loggedinuser.isEmpty()) {
				System.out.println("logged in");
				if(user.getRole().equalsIgnoreCase("user"))
				{
					mdlview.setViewName("userdashboard");
					mdlview.addObject("name",name);
					return mdlview;
				}
				else 
				{
					mdlview.setViewName("admindashboard");
					mdlview.addObject("name",name);
					return mdlview;
				}}
			
			else {
				mdlview.setViewName("index");
				return mdlview;}
		
		}
	@GetMapping(path="/signup")
	public String inituser(Model model) {
		System.out.println("inside signup");
		model.addAttribute("command",user);
		
		return "signup";
		
		
	}
	@PostMapping(path="/signup")
	private String onSumit(@Valid @ModelAttribute("command") User user) 
		{
		repo.save(user);
	
	return "success";
		}
	
	

}
