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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.eservice.config.Response;
import com.eservice.config.StatusSetting;
import com.eservice.model.Category;
import com.eservice.model.ServiceMan;
import com.eservice.model.User;
import com.eservice.service.AddressService;
import com.eservice.service.CategoryService;
import com.eservice.service.CityService;
import com.eservice.service.OrderService;
import com.eservice.service.ServiceManService;
import com.eservice.service.StateService;

@Controller
public class ServiceManController {

	@Autowired
	private ModelAndView modelAndView;

	@Autowired
	private ServiceManService service;

	@Autowired
	private StatusSetting statusSetting;

	@Autowired
	private ServiceMan serviceMan;

	@Autowired
	private CityService cityService;

	@Autowired
	private StateService stateService;

	@Autowired
	private CategoryService categoryService;

	@Autowired
	private AddressService addressService;

	@Autowired
	private OrderService orderService;

	@GetMapping("/serviceProvider")
	public ModelAndView serviceProvider(HttpSession session) {
		modelAndView.addObject("list", service.findByStatus(statusSetting.getSaveStatus()));
		modelAndView.setViewName("serviceMan");
		modelAndView.addObject("refresh", false);
		modelAndView.addObject("command", serviceMan);
		modelAndView.addObject("stateList", stateService.findAll());
		modelAndView.addObject("cityList", cityService.findAll());
		modelAndView.addObject("categoryList", categoryService.findbyStatus(statusSetting.getSaveStatus()));

		User existingUser = new User();
		existingUser = (User) session.getAttribute("userData");

		System.out.println("dfdfdfd=" + existingUser);

		if (existingUser != null) {
			modelAndView.addObject("adminStatus", existingUser.getRole().getId());
		}

		return modelAndView;

	}

	@PostMapping("/addServiceProvider")
	public ModelAndView addServiceProvider(@Valid @ModelAttribute("command") ServiceMan serviceMan,
			BindingResult result) {

		System.out.println("service provider category=" + serviceMan.getEmailId());

		modelAndView.addObject("errorMessage", "");
		modelAndView.addObject("refresh", false);
		try {

			if (serviceMan != null) {
				ServiceMan newCategory = new ServiceMan();

				ServiceMan catByName = new ServiceMan();
				catByName = service.findByEmailId(serviceMan.getEmailId());

				// check categoryExists or not
				if (catByName == null) {
					serviceMan.setStatus(1);

					serviceMan.getAddress().setCity(cityService.findbyId(serviceMan.getAddress().getCity().getId()));
					serviceMan.getAddress().setState(stateService.findbyId(serviceMan.getAddress().getState().getId()));
					serviceMan.setAddress(addressService.addAddress(serviceMan.getAddress()));

					newCategory = service.addServiceMan(serviceMan);

					if (newCategory != null) {

						System.out.println("refresh");

						modelAndView.addObject("refresh", true);
						modelAndView.setViewName("serviceMan");
					} else {
						modelAndView.setViewName("serviceMan");
						modelAndView.addObject("errorMessage", "Failed. Please try again.");
					}

				} else if (catByName != null && catByName.getId() == serviceMan.getId()) {
					serviceMan.setStatus(1);
					serviceMan.getAddress().setCity(cityService.findbyId(serviceMan.getAddress().getCity().getId()));
					serviceMan.getAddress().setState(stateService.findbyId(serviceMan.getAddress().getState().getId()));
					serviceMan.setAddress(addressService.addAddress(serviceMan.getAddress()));
					newCategory = service.addServiceMan(serviceMan);

					if (newCategory != null) {
						modelAndView.addObject("refresh", true);
						modelAndView.setViewName("serviceMan");
					} else {
						modelAndView.setViewName("serviceMan");
						modelAndView.addObject("errorMessage", "Failed. Please try again.");
					}
				} else {
					modelAndView.addObject("errorMessage", "Service Provider Email already exists.");
				}

			} else {
				modelAndView.addObject("errorMessage", "Service Provider Deatils can not be empty.");
			}

		} catch (Exception e) {
			e.printStackTrace();
			modelAndView.setViewName("serviceMan");
			modelAndView.addObject("errorMessage", "Something went wrong. Please try again.");
		}

		return modelAndView;
	}

	@GetMapping("/deleteServiceProviderById/{id}")
	public ResponseEntity<Response> deleteServiceProviderById(@PathVariable("id") long id) {
		try {
			if (id == 0) {
				return new ResponseEntity<Response>(new Response("Service Provider Id can not be null."),
						HttpStatus.OK);
			} else {
				int a = service.updateStatus(statusSetting.getDeleteStatus(), id);

				System.out.println("232323=" + a);

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

	@GetMapping("/changeBookingStatus")
	public ResponseEntity<Response> changeBookingStatus(@RequestParam("id") long id) {
		try {

			int orderStatus = orderService.updateOrderStatus("Service Complete", id);

			int status = service.updateBookingStatus(statusSetting.getDeleteStatus(),
					orderService.findById(id).getCart().getServiceMan().getId());

			if (status == 1 && orderStatus == 1) {

				return new ResponseEntity<Response>(new Response("success"), HttpStatus.OK);
			} else {
				return new ResponseEntity<Response>(new Response("Failed. Please try again."), HttpStatus.OK);
			}

		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Response>(new Response("Failed. Please try again."), HttpStatus.OK);
		}

	}

}
