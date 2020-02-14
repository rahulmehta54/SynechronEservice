package com.eservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.eservice.model.InspectionCharge;
import com.eservice.repository.InspectionChargeRepo;
import com.eservice.service.InspectionChargeService;

@Controller
public class InspectionChargeController {

	@Autowired
	private InspectionCharge inspectionCharge;

	@Autowired
	private InspectionChargeRepo inspectionChargeRepo;

	@Autowired
	private ModelAndView modelAndView;

	@Autowired
	private InspectionChargeService inspectionChargeServices;

	@GetMapping("/inspectionCharges")
	public String initForm(Model model) {
		model.addAttribute("command", inspectionCharge);
		model.addAttribute("inspectionChargesList", inspectionChargeServices.findByStatus(1));
		return "inspectionCharges";
	}

	@GetMapping("/addInspectionCharges")
	public String addInspectionCharges(Model model) {
		model.addAttribute("command", inspectionCharge);
		return "addInspectionCharges";

	}

	@PostMapping("/inspectionCharges")
	public ModelAndView addInspectionCharges(@ModelAttribute("command") InspectionCharge inspectionCharges) {
		inspectionCharges.setStatus(1);
		inspectionChargeServices.addInspectionCharge(inspectionCharges);
		modelAndView.addObject("inspectionChargesList", inspectionChargeServices.findByStatus(1));
		modelAndView.setViewName("inspectionCharges");
		return modelAndView;
	}
	


}
