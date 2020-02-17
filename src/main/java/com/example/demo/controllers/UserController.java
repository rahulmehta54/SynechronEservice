package com.example.demo.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demo.Service.ServiceProvider_ServiceImpl;
import com.example.demo.Service.UserServiceImpl;
import com.example.demo.entity.ServiceProvider;
import com.example.demo.entity.User;



@Controller
public class UserController {

	@Autowired
	 User user;
	
	@Autowired
	UserServiceImpl service;
	@Autowired
	ServiceProvider_ServiceImpl servImp;
	
	@GetMapping(path = "/index") 
	  public String loginMethod(Model model)  
	  { 
		  return "index";
	  }
	
	@GetMapping(path = "/userLogin")
	  public String userLogin(Model model)
		{
		     
			return "userLogin";
		}
	
	@GetMapping(path = "/adminLogin")
	  public String adminLogin(Model model)
		{
			return "adminLogin";
		}
	

	  @PostMapping(path ="/userLogin")
	  public String userOperations(@ModelAttribute("ModelForSession") User user,ModelMap mdl,HttpSession session)
	  {
		  User currentUser = service.checkUser(user);
		
		  if(currentUser!=null)
		  {
			  session.setAttribute("userSession",currentUser);
			
			  List<ServiceProvider> serProList = servImp.getAllServiceProvider();
			  mdl.addAttribute("servPro_list",serProList);
			  if(user.getRole().equals("user"))
			  {
			   return "UserOperations";
			  }
			  else
			  {
				  return "adminOperations";
			  }
		  }
		  else {
		      mdl.addAttribute("error","invalid login..! try again ");
		      if(user.getRole().equals("user"))
		      {
			  return "userLogin";
		      }
		      else
		      {
		    	  return "adminLogin";
		      }  
		  }
	  }
	
	  
	@GetMapping(path = "/userSignUp")
	public String GetuserSignUp(Model model)
	{
		return "userSignUp";
	}

	@PostMapping(path="/userSignUp")
	public String userSignUp(@ModelAttribute("command") User u)
	{
		service.registerUser(u);
		
		return "UserRegisterSuccess";
	}


  
   @GetMapping("/search")
   public String search(@RequestParam String keyword, ModelMap mm,HttpSession session)
   {
	   User user = (User)session.getAttribute("userSession");
	   mm.addAttribute("userFromSession",user);
	   List<ServiceProvider> result =  servImp.search(keyword);
	   mm.addAttribute("result",result);
	
	   return "UserOperations";
   }

}
