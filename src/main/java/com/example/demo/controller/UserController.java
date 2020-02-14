package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.UserDaoJPA;
import com.example.demo.daoimpl.UserDaoImpl;
import com.example.demo.dto.User;

@Controller
public class UserController {

	@Autowired
	private User user;

	@Autowired
	private ModelAndView mdlView;

	@Autowired
	private UserDaoImpl userDaoImpl;

	@Autowired
	private UserDaoJPA userDaoJPA;

	@GetMapping("/")
	public ModelAndView init() {
		mdlView.setViewName("index");
		mdlView.addObject("mainHeading", "E-Service");
		return mdlView;
	}

	@GetMapping("/login")
	public String initForm(Model model) {
		model.addAttribute("command", user);
		return "login";
	}

	@PostMapping("/login")
	public String checkLogin(HttpSession session, @ModelAttribute("command") User user) {
		String nextPage = "login";
		int i = this.userDaoImpl.loginUser(user);

		/**
		 * Setting user data in session
		 */
		User userData = this.userDaoImpl.getUserData(user);
		System.out.println("UserData in : " + userData);
		if (userData != null) {
			session.setAttribute("userSession", userData);
		}

		if (i == 1) {
			nextPage = "adminHome";
		} else if (i == 2) {
			nextPage = "userHome";
		}
		return nextPage;
	}

	@GetMapping("/register")
	public String initRegisterForm(Model model) {
		model.addAttribute("command", user);
		return "register";
	}

	@PostMapping("/register")
	public String registerUser(@ModelAttribute("command") User user) {
		String nextPage = "index";
		this.userDaoJPA.save(user);
		return nextPage;
	}
}

// https://www.javaguides.net/2019/08/spring-boot-web-application-with-jsp-crud-example-tutorial.html
// JOIN QUERY
// select * from tbl_user u 
//join tbl_cart tc
//on u.userId=tc.userId
//join tbl_servicemen ts
//on ts.sId=tc.sId
//where u.userId=2;