package com.synechronEservice.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.synechronEservice.demo.dao.ServiceProviderInterface;
import com.synechronEservice.demo.models.ServiceProvider;
import com.synechronEservice.demo.services.AdminServices;


@Controller
public class AdminController {
	@Autowired
	AdminServices adminservice;
	@Autowired
	ServiceProviderInterface srvcprointr;
	@RequestMapping(value = "editEmployeeModal/{serviceId}", method=RequestMethod.GET)

	public  String getAttr(@PathVariable(value="serviceId") int id,ModelMap model) {
		ServiceProvider serProv=adminservice.getProviderDetailUsingId(id);
		System.out.println(serProv.getFirstName());
		model.put("userDetail", serProv);
		return "editServiceProvider";
	}


}
