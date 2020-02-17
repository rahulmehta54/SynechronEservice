package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

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
import com.example.demo.dto.User;

@Controller
public class ServiceMenController {

	@Autowired
	private ServiceMen serviceMen;

	@Autowired
	private ServiceDaoJPA serviceDaoJPA;

	@Autowired
	private ServiceMenDaoImpl serviceMenDaoImpl;

	/**
	 * Add SERVICEMEN
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/addServiceMen")
	public String addServiceMen(Model model) {
		model.addAttribute("command", serviceMen);
		return "addServiceMen";
	}

	// Should not have two methods should have one method checking the user
	/**
	 * Open service men view form
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/viewServiceMen")
	public String openFormUser(Model model, HttpSession session) {
		String nextPage = "";
		List<ServiceMen> allServiceMens = this.serviceDaoJPA.findAll();
		model.addAttribute("allServiceMens", allServiceMens);
		model.addAttribute("command", serviceMen);

		User userData = (User) session.getAttribute("userSession");
		int userType = userData.getUserType();
		if (userType == 1) {
			nextPage = "viewServiceMen";
		} else if (userType == 2) {
			nextPage = "viewServiceMenUser";
		}
		return nextPage;
	}

	/**
	 * Search servicemen by city and category on user's dashboard
	 * 
	 * @param city
	 * @param category
	 * @param model
	 * @return
	 */
	@PostMapping("/searchServiceMenUser")
	public String searchServiceMenUser(@ModelAttribute("command") ServiceMen serviceMen, Model model) {
		String nextPage = "viewServiceMenUser";
		System.out.println("City - " + serviceMen.getCity() + " ,  Category - " + serviceMen.getCategory());
		List<ServiceMen> allServiceMens = this.serviceMenDaoImpl.filteredServiceMens(serviceMen);
		System.out.println("-----All Service Men after filter " + allServiceMens.size() + "-" + allServiceMens);
		model.addAttribute("allServiceMens", allServiceMens);
		return nextPage;
	}

	/**
	 * Add servicemen
	 * 
	 * @param serviceMen
	 * @param model
	 * @return
	 */
	@PostMapping("/addServiceMen")
	public String addServiceMen(@ModelAttribute("command") ServiceMen serviceMen, Model model) {
		String nextPage = "viewServiceMen";
		this.serviceDaoJPA.save(serviceMen);

		List<ServiceMen> allServiceMens = this.serviceDaoJPA.findAll();
		model.addAttribute("allServiceMens", allServiceMens);
		return nextPage;
	}

	/**
	 * Delete servicemen
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@GetMapping(value = "delete/{id}")
	public String deleteServiceMenById(@PathVariable("id") int id, Model model) {
		System.out.println("delete - user id : ==========" + id);
		this.serviceDaoJPA.deleteById(id);
		List<ServiceMen> allServiceMens = this.serviceDaoJPA.findAll();
		model.addAttribute("allServiceMens", allServiceMens);
		return "viewServiceMen";
	}

	/**
	 * Method to open edit service men form
	 * 
	 * @param sId
	 * @param model
	 * @return
	 */
	@GetMapping("/edit/{sId}")
	public String getServiceMenBeanById(@PathVariable("sId") int sId, Model model) {
		System.out.println("edit - user id : ==========" + sId);
		ServiceMen objServiceMen = serviceDaoJPA.findById(sId).get();
		System.out.println("ServiceMen Object By Id : ==========" + objServiceMen);
		model.addAttribute("command", objServiceMen);
		return "editServiceMen";
	}

	/**
	 * Update service men data
	 * 
	 * @param serviceMen
	 * @param model
	 * @return
	 */
	@PostMapping("/updateServiceMen")
	public String updateServiceMenById(@ModelAttribute("command") ServiceMen serviceMen, Model model) {
		System.out.println("ServiceMen Updated object : ==========" + serviceMen);
		this.serviceDaoJPA.save(serviceMen);
		String nextPage = "viewServiceMen";
		List<ServiceMen> allServiceMens = this.serviceDaoJPA.findAll();
		model.addAttribute("allServiceMens", allServiceMens);
		return nextPage;
	}
}
