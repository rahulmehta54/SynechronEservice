package com.eservice.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.eservice.model.User;
import com.eservice.service.UserService;

@Controller
public class LoginController {

	@Autowired
	private ModelAndView modelAndView;

	@Autowired
	private User user;

	@Autowired
	private UserService userService;

	@GetMapping("/login")
	public String loginForm(Model model) {
		model.addAttribute("command", user);
		return "login";
	}

	@PostMapping("/login")
	public ModelAndView getLogin(@ModelAttribute("command") User user, HttpSession session) {
		User userExist = new User();
		userExist = userService.findByUserNameAndPassword(user);
		if (userExist == null) {
			modelAndView.setViewName("login");
		} else {

			session.setAttribute("userData", userExist);
			

			if (userExist.getRole().getRoleId() == 1) {
				modelAndView.setViewName("dashboard");
			} else {
				modelAndView.setViewName("dashboard2");
			}

		}
		return modelAndView;
	}

}