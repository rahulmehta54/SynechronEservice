package com.EServiceApp.Controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.EServiceApp.Service.UserService;
import com.EServiceApp.entity.User;
import com.EServiceApp.repo.UserRepository;


@Controller
public class UserController {

	@Autowired
	private UserRepository repo;

	@Autowired
	private ModelAndView mdlView;

	@Autowired
	private User user;

	@Autowired
	private UserService userServ;

	@GetMapping("/")
	public ModelAndView init() {
		mdlView.setViewName("dashboard");
		mdlView.addObject("mainHeading", "Welcome TO E-Service...!!");
		return mdlView;
	}
/**********************************************User Registration************************************************************/
	
	@GetMapping(path = "/registration")
	public String registration(Model model) {
		model.addAttribute("command", user);
		return "registration";
	}

	@PostMapping(path = "/registration")
	public String register(@ModelAttribute("command") User user) {
	
		userServ.register(user);
		//repo.saveAndFlush(user);
		return "dashboard";
	}

	
/*******************************************User Login ***************************************************************/	
	
	@GetMapping(path = "/login")
	public String initForm(Model model) {
		model.addAttribute("command", user);
		return "login";
	}

	@PostMapping(path = "/login")
	public ModelAndView onSubmit(@Valid @ModelAttribute("command") User user) {

		User userExist = new User();

		userExist = userServ.findByUserNameAndPassword(user);
		if (userExist == null) {
			mdlView.setViewName("login");
			mdlView.addObject("errorMessage", "Invalid user");
		} else {
			mdlView.setViewName("dashboard");
		}
		return mdlView;
	}

	

}
