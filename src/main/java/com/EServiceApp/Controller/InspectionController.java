package com.EServiceApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.EServiceApp.Service.InspectionChargeService;
import com.EServiceApp.entity.Inspection;


@Controller
public class InspectionController {
	
	@Autowired
	private Inspection inspection;
	
	@Autowired
	private ModelAndView mdlview;
	
	@Autowired
	private InspectionChargeService Iservice;
	
	
	
/**********************************************User category************************************************************/
	
	@GetMapping(path = "/inspectionCharge")
	public String inspection(Model model) {
		model.addAttribute("command", "inspection");
		return "inspectionCharge";
	}

	@PostMapping(path = "/inspectionCharge")
	public String addinspectionCharge(@ModelAttribute("command") Inspection inspection) {
		
	Iservice.addinspectionCharge(inspection);
	
		return "dashboard";
	}


}
