package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dao.ServiceDaoJPA;
import com.example.demo.dto.ServiceMen;

@Controller
public class ServiceMenController {

	@Autowired
	private ServiceMen serviceMen;

	@Autowired
	private ServiceDaoJPA serviceDaoJPA;

	@GetMapping("/addServiceMen")
	public String initForm(Model model) {
		model.addAttribute("command", serviceMen);
		return "addServiceMen";
	}

	@PostMapping("/addServiceMen")
	public String checkServiceMen(@ModelAttribute("command") ServiceMen serviceMen) {
		String nextPage = "addServiceMen";
		this.serviceDaoJPA.save(serviceMen);
		return nextPage;
	}

	@GetMapping("/viewServiceMen")
	public String initViewForm(Model model) {
		List<ServiceMen> allServiceMens = this.serviceDaoJPA.findAll();
		model.addAttribute("allServiceMens", allServiceMens);
		return "viewServiceMen";
	}

}
