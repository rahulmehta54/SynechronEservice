package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.ViewServiceMen;
import com.example.demo.entity.ServiceMen;
import com.example.demo.entity.User;
import com.example.demo.repos.ServiceMenRepository;


import lombok.Setter;

@Controller
@Setter
public class ServiceMenController {

	@Autowired
	private ServiceMenRepository srepo;
	
	@Autowired
	private ViewServiceMen vsm;
	
	@Autowired
	private ServiceMenRepository repo;
	
	@Autowired
	private ModelAndView mdlView;
	
	@GetMapping(path="/adminMenu")
	public String showAdminMenu() {
		return "adminMenu";
	}
	@GetMapping(path="/addServiceMen")
	public String showAddServiceMenPage() {
		return "addServiceMen";
	}
	
	@PostMapping(path="/addServiceMen")
	public String onSubmit(Model model, @Valid @ModelAttribute("command") ServiceMen smen) {
		srepo.save(smen);
		model.addAttribute("addSuccessful", "Service Man Added Successfully!");
		return "adminMenu";
	}

	@GetMapping(path = "/viewServiceMen")
	public String findAll(Model model, @ModelAttribute("command") ServiceMen smen) {
		
		List<ServiceMen> serviceMenList =repo.findAll();
		model.addAttribute("serviceMenList", serviceMenList);
		return "viewServiceMen" ;
	}
//	@GetMapping(path="/editServiceMen")
//	public ModelAndView showEditPage(@ModelAttribute("command") int id) {
//		System.out.println("========================================");
//		System.out.println("yooo" + id);
//		Optional<ServiceMen> serviceMenList =repo.findById(id);
//		System.out.println("hellloooo: "+serviceMenList.get());
//		mdlView.addObject("serviceMenList", serviceMenList);
//		mdlView.setViewName("editServiceMen");
//		return mdlView;
//  }	
	@GetMapping(path="/editServiceMen")
	public ModelAndView showEditPage(@RequestParam int id, @ModelAttribute("command") ServiceMen serviceMen) {
		
		ModelAndView mav = new ModelAndView("editServiceMen");
		List<ServiceMen> list = new ArrayList<ServiceMen>();
		Optional<ServiceMen> smen = repo.findById(id);
		list.add(smen.get());
		System.out.println("Helllo " + smen.get());
		mav.addObject("serviceMenDetail", list );
		
		
		return mav;
	}
//	public String showEditServicePage() {
//		return "editServiceMen";
//	}
//	

//	@RequestMapping(value = "/editServiceMen", method=RequestMethod.GET)
//	public  String getAttr(@PathVariable(value="id") int id,ModelMap model) {
//		srepo.findById(id);
//		Optional<ServiceMen> s =srepo.findById(id);
//		ServiceMen ser=s.get();
//	//	System.out.println(serProv.getFirstName());
//		model.put("serviceMenDetail", ser);
//		return "editServiceMen";
//	}
	
	@GetMapping(path = "/searchServiceMen")
	public String searchAll(Model model, @ModelAttribute("command") ServiceMen smen) {
		
		List<ServiceMen> serviceMenList =repo.findAll();
		model.addAttribute("serviceMenList", serviceMenList);
		return "searchServiceMen" ;
	}
}


