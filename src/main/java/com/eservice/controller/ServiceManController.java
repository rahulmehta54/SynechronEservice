package com.eservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.eservice.model.ServiceMan;
import com.eservice.repository.StateRepo;
import com.eservice.service.AddressService;
import com.eservice.service.CategoryService;
import com.eservice.service.CityService;
import com.eservice.service.ServiceManService;
import com.eservice.service.StateService;

@Controller
public class ServiceManController {

	@Autowired
	private CategoryService categoryService;

	@Autowired
	private CityService cityService;

	@Autowired
	private StateService stateService;

	@Autowired
	private StateRepo stateRepo;

	@Autowired
	private ServiceMan serviceMan;

	@Autowired
	private ServiceManService serviceManService;

	@Autowired
	private ModelAndView modelAndView;

	@Autowired
	private AddressService addressService;

	@GetMapping("/serviceMan")
	public String initForm(Model model) {
		model.addAttribute("command", serviceMan);
		model.addAttribute("serviceManList", serviceManService.findByStatus(1));
		return "serviceMan";
	}

	@PostMapping("/serviceMan")
	public ModelAndView addServiceMan(@ModelAttribute("command") ServiceMan serviceMan) {
		serviceMan.setStatus(1);
		serviceMan.getAddress().setCity(cityService.findById(serviceMan.getAddress().getCity().getCityId()));
		serviceMan.getAddress().setState(stateService.findById(serviceMan.getAddress().getState().getStateId()));
		serviceMan.setAddress(addressService.saveAddress(serviceMan.getAddress()));
		serviceManService.addServiceMan(serviceMan);
		modelAndView.setViewName("serviceMan");
		modelAndView.addObject("command", serviceMan);
		modelAndView.addObject("serviceManList", serviceManService.findByStatus(1));
		return modelAndView;
	}

	@GetMapping("addServiceMan")
	public String addServiceMan(Model model) {
		model.addAttribute("command", serviceMan);
		model.addAttribute("categoryList", categoryService.findByStatus(1));
		model.addAttribute("cityList", cityService.findAll());
		model.addAttribute("stateList", stateRepo.findAll());
		return "addServiceMan";
	}

	@GetMapping("updateServiceMan")
	public String updateServiceMan(Model model, @RequestParam("serviceId") long serviceId) {
		ServiceMan man = new ServiceMan();
		man = serviceManService.findById(serviceId);
		model.addAttribute("serviceId", serviceId);
		model.addAttribute("categoryList", categoryService.findByStatus(1));
		model.addAttribute("cityList", cityService.findAll());
		model.addAttribute("stateList", stateRepo.findAll());
		model.addAttribute("serviceMan", man);
		model.addAttribute("command", serviceMan);
		return "editServiceMan";
	}
	
	@GetMapping("deleteServiceMan")
	public String deleteServiceMan(Model model, @RequestParam("id") long serviceId) {
		serviceManService.updateStatus(0, serviceId);
		model.addAttribute("serviceId", serviceId);
		model.addAttribute("command", serviceMan);
		model.addAttribute("serviceManList", serviceManService.findByStatus(1));
		return "serviceMan";
	}

}