package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Serviceman;
import com.example.demo.repos.ServicemanRepository;

@Controller
public class ServiceManController {

	@Autowired
	private Serviceman serviceman;

	@Autowired
	private ServicemanRepository servicemanRepository;

	@Autowired
	private ModelAndView modelAndView;

	/*
	 * @GetMapping("/addServiceman") public ModelAndView serviceman() {
	 * modelAndView.setViewName("addServiceman"); return modelAndView; }
	 */

	@GetMapping("/addServiceman")
	public String intServicemanForm(Model model) {
		model.addAttribute("command", serviceman);
		return "addServiceman";
	}

	@PostMapping("/addServiceman")
	public String onSubmitServicemanForm(@ModelAttribute("command") Serviceman serviceman) {
		String nextPage = "success";
		this.servicemanRepository.save(serviceman);
		return nextPage;
	}

	@GetMapping("/adminHome")
	public String adminHome() {
		return "adminHome";
	}

	@GetMapping("/viewServicemen")
	public ModelAndView viewServiceMen() {
		modelAndView.setViewName("viewServicemen");
		modelAndView.addObject("list", servicemanRepository.findAll());
		return modelAndView;
	}

	@RequestMapping(value = "/deleteServiceman/{id}", method = RequestMethod.GET)
	public ModelAndView deleteServiceman(@PathVariable int id) {

		this.servicemanRepository.deleteById(id);
		modelAndView.setViewName("viewServicemen");
		modelAndView.addObject("list", servicemanRepository.findAll());
		return modelAndView;
	}

	@GetMapping("/editServiceman/{service_Id}")
	public ModelAndView editServicemen(@PathVariable int service_Id, Model model) {
		/*
		 * model.addAttribute("serviceMan",
		 * this.servicemanRepository.findById(service_Id)); return "editServiceman";
		 */
		modelAndView.setViewName("editServiceman");
		serviceman = servicemanRepository.findById(service_Id).get();
		modelAndView.addObject("command", serviceman);
		return modelAndView;
	}

	@RequestMapping(value = "/updateServiceman", method = RequestMethod.POST)
	public String onUpdateAndSubmitServiceman(@ModelAttribute("command") Serviceman serviceman, Model model) {
		System.out.println(serviceman.getService_Id());
		servicemanRepository.save(serviceman);
//		List<Serviceman> allserviceman = this.servicemanRepository.findAll();
		model.addAttribute("list", servicemanRepository.findAll());
		return "viewServicemen";
	}

	@GetMapping("/userServiceman")
	public String initCart(Model model) {
		// modelAndView.setViewName("viewServicemenForUser");
		List<Serviceman> list = servicemanRepository.findAll();
		System.out.println("=========" + list);
		// modelAndView.addObject("list",list);
		model.addAttribute("list", list);
		return "userServiceman";

	}

}
