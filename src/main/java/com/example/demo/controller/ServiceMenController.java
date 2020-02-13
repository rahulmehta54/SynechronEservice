package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dao.ServiceDaoJPA;
import com.example.demo.daoimpl.ServiceMenDaoImpl;
import com.example.demo.dto.ServiceMen;

@Controller
public class ServiceMenController {

	@Autowired
	private ServiceMen serviceMen;

	@Autowired
	private ServiceDaoJPA serviceDaoJPA;

	@Autowired
	private ServiceMenDaoImpl serviceMenDaoImpl;

	@GetMapping("/addServiceMen")
	public String initForm(Model model) {
		model.addAttribute("command", serviceMen);
		return "addServiceMen";
	}

	// -----SEARCH SERVICEMEN
	@GetMapping("/viewServiceMen")
	public String openForm(Model model) {
		List<ServiceMen> allServiceMens = this.serviceDaoJPA.findAll();
		model.addAttribute("allServiceMens", allServiceMens);
		return "viewServiceMen";
	}

	@GetMapping("/viewServiceMenUser")
	public String openFormUser(Model model) {
		List<ServiceMen> allServiceMens = this.serviceDaoJPA.findAll();
		model.addAttribute("allServiceMens", allServiceMens);
		return "viewServiceMenUser";
	}

	// -----SEARCH SERVICEMEN BY CITY AND CATEGORY
	@PostMapping("/searchServiceMen")
	public String searchServiceMen(@RequestParam("city") String city, @RequestParam("category") String category,
			Model model) {
		String nextPage = "viewServiceMen";
//		List<ServiceMen> allServiceMens = this.serviceMenDaoImpl.filteredServiceMens(serviceMen);
//		model.addAttribute("allServiceMens", allServiceMens);
		return nextPage;
	}

	@PostMapping("/searchServiceMenUser")
	public String searchServiceMenUser(@RequestParam("city") String city, @RequestParam("category") String category,
			Model model) {
		String nextPage = "viewServiceMenUser";
		System.out.println("City and Category" + city + " - " + category);
		List<ServiceMen> allServiceMens = this.serviceMenDaoImpl.filteredServiceMens(serviceMen);
		model.addAttribute("allServiceMens", allServiceMens);
		return nextPage;
	}

	// -----ADD SERVICEMEN
	@PostMapping("/addServiceMen")
	public String checkServiceMen(@ModelAttribute("command") ServiceMen serviceMen, Model model) {
		String nextPage = "viewServiceMen";
		this.serviceDaoJPA.save(serviceMen);

		List<ServiceMen> allServiceMens = this.serviceDaoJPA.findAll();
		model.addAttribute("allServiceMens", allServiceMens);
		return nextPage;
	}

	// -----DELETE SERVICEMEN
	@GetMapping(value = "delete/{id}")
	public String deleteServiceMenById(@PathVariable("id") int id, Model model) {
		System.out.println("delete - user id : ==========" + id);
		this.serviceDaoJPA.deleteById(id);
		List<ServiceMen> allServiceMens = this.serviceDaoJPA.findAll();
		model.addAttribute("allServiceMens", allServiceMens);
		return "viewServiceMen";
	}

	// -----EDIT SERVICEMEN
	@GetMapping("/edit/{sId}")
	public String getServiceMenBeanById(@PathVariable("sId") int sId, Model model) {
		System.out.println("edit - user id : ==========" + sId);
		ServiceMen objServiceMen = serviceDaoJPA.findById(sId).get();
		System.out.println("ServiceMen Object By Id : ==========" + objServiceMen);
		model.addAttribute("command", objServiceMen);
		return "editServiceMen";
	}

	@PostMapping("/updateServiceMen")
	public String updateServiceMenById(@ModelAttribute("command") ServiceMen serviceMen, Model model) {
		System.out.println("ServiceMen Updated object : ==========" + serviceMen);
		this.serviceDaoJPA.save(serviceMen);
		String nextPage = "viewServiceMen";
//		this.serviceMenDaoImpl.editServiceMen(serviceMen);
		List<ServiceMen> allServiceMens = this.serviceDaoJPA.findAll();
		model.addAttribute("allServiceMens", allServiceMens);
		return nextPage;
	}

//	@GetMapping("/edit/{sId}/{sMenFName}/{sMenLName}/{mobile}/{city}/{category}/{experience}/{inspectionRates}")
//	public String getServiceMenById(@PathVariable("sId") int sId, @PathVariable("sMenFName") String sMenFName,
//			@PathVariable("sMenLName") String sMenLName, @PathVariable("mobile") String mobile,
//			@PathVariable("city") String city, @PathVariable("category") String category,
//			@PathVariable("experience") String experience, @PathVariable("inspectionRates") String inspectionRates,
//			Model model) {
//		System.out.println("edit id : ==========" + sMenFName);
//		ServiceMen srMen = new ServiceMen(sId, sMenFName, sMenLName, mobile, category, city, experience,
//				inspectionRates);
//		model.addAttribute("command", srMen);
//		return "editServiceMen";
//	}
}
