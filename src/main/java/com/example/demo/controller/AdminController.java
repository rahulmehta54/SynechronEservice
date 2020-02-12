package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.controller.repository.SalesPersonRepository;
import com.example.demo.controller.repository.UserRepository;
import com.example.demo.entity.SalesPerson;
import com.example.demo.entity.User;

import lombok.Setter;

@Controller 
@Setter
public class AdminController {
	@Autowired
	private SalesPersonRepository   repo;
	@Autowired
	private ModelAndView mdlview;
	@Autowired
	private SalesPerson  salesperson;
	@GetMapping(path="/addSaleperson")
	public String initForm(Model model) {
		model.addAttribute("command",salesperson);
		System.out.println("hello world");
		return "addsalesperson";
	}
	@ModelAttribute("categoryList")
	public List<String> getCategory() {
		List<String> categoryList  = new ArrayList<String>();
		categoryList .add("Carpenter");
		categoryList .add("Electrician");
		categoryList .add("Plumber");
		categoryList .add("Driver");
		return categoryList;
	}

	@PostMapping(path="/addSaleperson")
	private String onSubmit(@Valid @ModelAttribute("command") SalesPerson  salesperson) 
	{

		repo.save(salesperson);
		return "success";


	}
	
	@GetMapping(path="/deleteSaleperson")
	public ModelAndView deleteSaleperson() {
		List<SalesPerson> list=repo.findAll();
		
		
		
		mdlview.addObject("vendorlist",list);
		mdlview.setViewName("editdelvendor");
		return mdlview;
	
	}
	



}
