package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.controller.repository.SalesPersonRepository;
import com.example.demo.controller.repository.UserRepository;
import com.example.demo.entity.SalesPerson;
import com.example.demo.entity.User;

import lombok.Setter;

@Controller 
@Setter
public class UserController {
	@Autowired
	private SalesPersonRepository   repo;
	@Autowired
	private ModelAndView mdlview;
	@Autowired
	private SalesPerson  salesperson;
	
	@GetMapping(path="/viewSalesperson")
	public ModelAndView initForm(Model model) {
		List<SalesPerson > salesPersonlist=new ArrayList<>();
		salesPersonlist=repo.findAll();
		System.out.println(salesPersonlist);
		//model.addAttribute("salesPersonlist",salesPersonlist);
		List<Long> idlist=new ArrayList<>();
		mdlview.addObject("salesPersonlist",salesPersonlist);
		mdlview.addObject("idlist",idlist);
		mdlview.setViewName("viewSalesperson");
		System.out.println("yoooooooooooo");
		//
		return mdlview;
				//return "viewSalesperson";
	}
	
	  @PostMapping(path="/addSalepersonTobuy")
	  private String addsaalePerson(@RequestParam("check")Long[] checkboxvalues) { 
		  
		// Integer[] selectedStudentIds = request.getParameterValues("selected");
	  
	  for (Long check: checkboxvalues) { // repo.deleteById(integer);
	  System.out.println(check); // repo.deleteById(check);
	  
	  }
	  
	  return "success";
	  
	  
	  }
	 
}
