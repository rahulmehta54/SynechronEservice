package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dao.ServiceDaoJPA;
import com.example.demo.daoimpl.UserDaoImpl;
import com.example.demo.dto.ServiceMen;

@Controller
public class ServiceMenController {

	@Autowired
	private ServiceMen serviceMen;

	@Autowired
	private ServiceDaoJPA serviceDaoJPA;

	@Autowired
	private UserDaoImpl userDaoImpl;

	@GetMapping("/addServiceMen")
	public String initForm(Model model) {
		model.addAttribute("command", serviceMen);
		return "addServiceMen";
	}

	@PostMapping("/addServiceMen")
	public String checkServiceMen(@ModelAttribute("command") ServiceMen serviceMen) {
		String nextPage = "viewServiceMen";
		this.serviceDaoJPA.save(serviceMen);
		return nextPage;
	}

	@GetMapping("/viewServiceMen")
	public String initViewForm(Model model) {
		List<ServiceMen> allServiceMens = this.serviceDaoJPA.findAll();
		model.addAttribute("allServiceMens", allServiceMens);
		return "viewServiceMen";
	}

	@GetMapping("/viewServiceMenUser")
	public String initViewFormForUser(Model model) {
		List<ServiceMen> allServiceMens = this.serviceDaoJPA.findAll();
		model.addAttribute("allServiceMens", allServiceMens);
		return "viewServiceMenUser";
	}

	@GetMapping(value = "delete/{id}")
	public String deleteServiceMenById(@PathVariable int id, Model model) {
		System.out.println("delete id : ==========" + id);
		this.serviceDaoJPA.deleteById(id);
		return "adminHome";
	}

	@GetMapping(value = "edit")
	public String editServiceMenById(@ModelAttribute("command") ServiceMen serviceMen) {
		System.out.println("edit id : ==========" + serviceMen.getsId());
		System.out.println("servicemen: ==========" + serviceMen);
		return "editServiceMen";
	}
}
