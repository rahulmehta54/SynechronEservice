package com.eservice.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.eservice.config.Response;
import com.eservice.config.StatusSetting;
import com.eservice.model.Category;
import com.eservice.model.InspectionRate;
import com.eservice.model.User;
import com.eservice.repository.InspectionRateRepo;
import com.eservice.service.InspectionRateService;

@Controller
public class InspectionRateController {

	@Autowired
	private InspectionRateService service;

	@Autowired
	private ModelAndView modelAndView;

	@Autowired
	private StatusSetting statusSetting;

	@Autowired
	private InspectionRate rate;

	@GetMapping("/inspectionRate")
	public ModelAndView inspectionRate(HttpSession session) {
		modelAndView.setViewName("inspectionRate");
		modelAndView.addObject("errorMessage", "");
		modelAndView.addObject("refresh", false);
		User existingUser = new User();
		existingUser = (User) session.getAttribute("userData");
		if (existingUser != null) {
			modelAndView.addObject("adminStatus", existingUser.getRole().getId());
		}
		System.out.println("existingUser=" + existingUser);

		modelAndView.addObject("list", service.findByStatus(statusSetting.getSaveStatus()));
		modelAndView.addObject("command", this.rate);
		return modelAndView;
	}

	@PostMapping("/addInspectionRate")
	public ModelAndView addCategory(@Valid @ModelAttribute("command") InspectionRate rate, BindingResult result) {

		modelAndView.addObject("errorMessage", "");
		modelAndView.addObject("refresh", false);
		try {

			if (rate != null) {
				InspectionRate inspectionRate = new InspectionRate();

				InspectionRate catByName = new InspectionRate();
				catByName = service.findByName(rate.getServiceName(), statusSetting.getSaveStatus());

				// check categoryExists or not
				if (catByName == null) {
					rate.setStatus(1);
					inspectionRate = service.addInspectionRate(rate);

					if (inspectionRate != null) {

						System.out.println("refresh");

						modelAndView.addObject("refresh", true);
						modelAndView.setViewName("inspectionRate");
					} else {
						modelAndView.setViewName("inspectionRate");
						modelAndView.addObject("errorMessage", "Failed. Please try again.");
					}

				} else if (catByName != null && catByName.getId() == rate.getId()) {
					rate.setStatus(1);
					inspectionRate = service.addInspectionRate(rate);

					if (inspectionRate != null) {
						modelAndView.addObject("refresh", true);
						modelAndView.setViewName("inspectionRate");
					} else {
						modelAndView.setViewName("inspectionRate");
						modelAndView.addObject("errorMessage", "Failed. Please try again.");
					}
				} else {
					modelAndView.addObject("errorMessage", "Service Name name already exists.");
				}

			} else {
				modelAndView.addObject("errorMessage", "Service Name can not be empty.");
			}

		} catch (Exception e) {
			e.printStackTrace();
			modelAndView.setViewName("inspectionRate");
			modelAndView.addObject("errorMessage", "Something went wrong. Please try again.");
		}

		return modelAndView;
	}

	@GetMapping("/deleteInspectionRateById/{id}")
	public ResponseEntity<Response> deleteInspectionRateById(@PathVariable("id") long id) {
		try {
			if (id == 0) {
				return new ResponseEntity<Response>(new Response("Inspection rate id can not be null."), HttpStatus.OK);
			} else {
				int a = service.deleteByStatus(statusSetting.getDeleteStatus(), id);
				if (a == 1) {
					return new ResponseEntity<Response>(new Response("success"), HttpStatus.OK);
				} else {
					return new ResponseEntity<Response>(new Response("failed"), HttpStatus.OK);
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Response>(new Response("failed"), HttpStatus.OK);
		}
	}

}
