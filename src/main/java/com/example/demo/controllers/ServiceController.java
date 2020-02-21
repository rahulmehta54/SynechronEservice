package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

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

import com.example.demo.entity.ServiceMen;
import com.example.demo.repos.ServiceRepository;

@Controller
public class ServiceController {

	@Autowired
	private ModelAndView mdlView;

	@Autowired
	private ServiceRepository servicerepo;

	@Autowired
	private ServiceMen service;

	@GetMapping("/addServiceMen")
	public String initRegisterForm(Model model) {
		model.addAttribute("command", service);
		return "addServiceMen";
	}

	@PostMapping("/addServiceMen")
	public String checkService(@ModelAttribute("command") ServiceMen service) {
		String nextpage = "adminhome";
		this.servicerepo.save(service);
		return nextpage;

	}

	@GetMapping("/viewServiceMen")
	public String initViewform(Model model) {
		List<ServiceMen> allServiceMens = this.servicerepo.findAll();

		System.out.println("==========data===========" + allServiceMens);

		model.addAttribute("allServiceMens", allServiceMens);

		return "viewServiceMen";

	}

	@GetMapping("/viewServiceMenForUser")
	public String Openform(Model model) {
		List<ServiceMen> allServiceMens = this.servicerepo.findAll();

		System.out.println("==========data===========" + allServiceMens);

		model.addAttribute("allServiceMens", allServiceMens);

		return "viewServiceMenForUser";

	}
	/*
	 * @GetMapping("/viewServiceMenForUser") public String initViewform(Model model)
	 * { List<ServiceMen> allServiceMens = this.servicerepo.findAll();
	 * 
	 * System.out.println("==========data===========" + allServiceMenForUser);
	 * 
	 * model.addAttribute("allServiceMenforUser", allServiceMenForUser);
	 * 
	 * return "viewServiceMenForUser";
	 * 
	 * }
	 */

//	
	@GetMapping(value = "/delete/{id}")
	public String deleteServiceMen(@PathVariable("id") int id, Model model) {

		System.out.println("delete user" + id);

		this.servicerepo.deleteById(id);
		List<ServiceMen> allServiceMens = this.servicerepo.findAll();
		model.addAttribute("allServiceMens", allServiceMens);

		return "viewServiceMen";

	}


	@GetMapping("/edit/{serviceId}")
	public ModelAndView editServicemen(@PathVariable("serviceId") int serviceId, Model model) {
		/*
		 * model.addAttribute("serviceMan",
		 * this.servicemanRepository.findById(service_Id)); return "editServiceman";
		 */

		// System.out.println("=====service id====="+serviceId);
		mdlView.setViewName("editServiceMen");
        
		ServiceMen serviceMen = servicerepo.findById(serviceId).get();
//		serviceMen.setsFName(sFName);
        
		//System.out.println("=====service data====="  );
		//serviceMen.setsFName(service.getsFName());
		//servicerepo.save(serviceMen);
		//mdlView.addObject("ServiceMen", serviceMen);
		mdlView.addObject("command", serviceMen);
		
		return mdlView;

	}

	@RequestMapping(value = "/updateServiceMen", method = RequestMethod.POST)
	public String onUpdateAndSubmitServiceman(@ModelAttribute("command") ServiceMen service, Model model) {
		//System.out.println(service.getServiceId());
		servicerepo.save(service);
//		List<Serviceman> allserviceman = this.servicemanRepository.findAll();
		model.addAttribute("allServiceMens", servicerepo.findAll());
		return "viewServiceMen";
		
		
	}

}


//	@GetMapping(path = "/viewService")
//	public ModelAndView findAll() {
//		mdlView.setViewName("viewService");
//		mdlView.addObject("list", servicerepo.findAll());
//		return mdlView;
//	}
