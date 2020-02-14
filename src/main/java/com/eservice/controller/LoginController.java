package com.eservice.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.eservice.config.StatusSetting;
import com.eservice.model.User;
import com.eservice.repository.RoleRepo;
import com.eservice.service.RoleService;
import com.eservice.service.UserService;

@Controller
public class LoginController {

	@Autowired
	private ModelAndView modelAndView;

	@Autowired
	private User user;

	@Autowired
	private UserService userService;

	@Autowired
	private RoleRepo repo;

	@Autowired
	private StatusSetting statusSetting;

	@GetMapping("/index")
	public ModelAndView loginPage() {
		modelAndView.setViewName("login");

		user = new User();

		modelAndView.addObject("command", user);
		modelAndView.addObject("errorMessage", "");
		return modelAndView;
	}

	@PostMapping("/login")
	public ModelAndView login(@Valid @ModelAttribute("command") User user, BindingResult result, HttpSession session) {

		modelAndView.addObject("errorMessage", "");
		try {

			if (user != null) {

				User existingUser = new User();
				existingUser = userService.checkLogin(user);
				if (existingUser != null) {
					session.setAttribute("userData", existingUser);

					System.out.println("admin status=" + existingUser.getRole().getId());

					modelAndView.addObject("adminStatus", existingUser.getRole().getId());
					modelAndView.setViewName("dashboard");
				} else {
					modelAndView.setViewName("login");
					modelAndView.addObject("errorMessage", "Invalid Email Address or Password.");
				}

			} else {
				modelAndView.setViewName("login");
				modelAndView.addObject("errorMessage", "Login credentials can not be empty.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			modelAndView.setViewName("login");
			modelAndView.addObject("errorMessage", "Something went wrong. Please try again.");
		}

		return modelAndView;
	}

	@GetMapping("/dashboard")
	public ModelAndView dashboard(HttpSession session) {
		User existingUser = (User) session.getAttribute("userData");
		modelAndView.addObject("adminStatus", existingUser.getRole().getId());
		modelAndView.setViewName("dashboard");
		return modelAndView;
	}

	@GetMapping("/logout")
	public ModelAndView logout(HttpSession session) {
		session.invalidate();
		modelAndView.addObject("command", user);
		modelAndView.addObject("errorMessage", "");
		modelAndView.setViewName("login");
		return modelAndView;

	}

	@GetMapping("/registration")
	public ModelAndView registration() {
		modelAndView.addObject("command", user);
		modelAndView.setViewName("registration");
		return modelAndView;
	}

	@PostMapping("/addUser")
	public ModelAndView addUser(@ModelAttribute("command") User user) {
		try {

			user.setRole(repo.getOne(statusSetting.getUserRole()));

			User userNew = new User();

			userNew = userService.addUser(user);

			if (userNew != null) {
				modelAndView.setViewName("login");
				modelAndView.addObject("command", user);
				modelAndView.addObject("errorMessage", "");
			} else {
				modelAndView.setViewName("login");
				modelAndView.addObject("command", user);
				modelAndView.addObject("errorMessage", "");
			}

		} catch (Exception e) {
			e.printStackTrace();
			modelAndView.setViewName("login");
			modelAndView.addObject("command", user);
			modelAndView.addObject("errorMessage", "");
		}
		return modelAndView;
	}

}
