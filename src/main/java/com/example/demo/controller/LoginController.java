package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;
import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.daos.UserDao;
import com.example.demo.entity.Admin;
import com.example.demo.entity.ServiceProviderInfo;
import com.example.demo.entity.UserInfo;
import com.example.demo.repos.UserInfoRepository;

@Controller
public class LoginController {

	@Autowired
	private UserInfo userInfo ;
	
	@Autowired
	private Admin adminInfo ;
	
	@Autowired
	private UserInfoRepository repo ;
	
	/*
	 * @Autowired private UserDao dao;
	 */

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
		model.addAttribute("command", adminInfo);
		return "adminLogin";
		
	}
	
	@PostMapping(path = "/adminLoginValidation")
	public String adminLogin(@Valid @ModelAttribute("command") Admin admin)
	{
		System.out.println("inside method");
		
		String enteredName = admin.getName();
		String enteredPass = admin.getPass();
	
		String nextPage = "failure";		
		
			
			  if("admin".equals(enteredName) && "admin".equals(enteredPass)) 
			  { 
				  return "adminOperation";
			  }
			  else
			  {
				  System.out.println("else part=============");
				  nextPage ="adminLogin";	
			  }
		
		return nextPage;
		
	}
	
	
	  @PostMapping(path = "/userLoginValidation") 
	  public ModelAndView userLogin(@Valid @ModelAttribute("command") UserInfo userInfo) {
		  System.out.println("inside LoginValidation method");
		  ModelAndView mav = new ModelAndView();

		  List<UserInfo> list= (List<UserInfo>) repo.findByUserNameAndPassword(userInfo.getUserName(),userInfo.getPassword());
		  
		  for(UserInfo val : list)
		  {
			 System.out.println("name: "+val.getUserName());
			 System.out.println("value: "+val.getPassword());
			 if(!val.getUserName().equals("") && !val.getPassword().equals("")) { 
				 mav.setViewName("userOperation");
				  //ModelAndView mav = new ModelAndView("userOperation");
				  mav.addObject("listServicemen", list);	
				  return mav;
			  } 
			  else { 
				  System.out.println("else part=============");
				  mav.setViewName("userLogin");
			 // nextPage  = "userLogin"; 
			  }
		  }
	  
		  return mav;
	  
	  }
	 
}



