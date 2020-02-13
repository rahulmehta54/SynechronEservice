package com.synechronEservice.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.synechronEservice.demo.dao.ServiceProviderInterface;
import com.synechronEservice.demo.models.ServiceProvider;
import com.synechronEservice.demo.models.Users;
import com.synechronEservice.demo.services.AdminServices;


@Controller
public class AdminController {
	@Autowired
	AdminServices adminservice;
	@Autowired
	ServiceProviderInterface srvcprointr;
	
	
	@RequestMapping(value = "editEmployeeModal/{serviceId}", method=RequestMethod.GET)
    public  ModelAndView getAttr(@PathVariable(value="serviceId") int id,ModelMap model) {
		ServiceProvider serProv=adminservice.getProviderDetailUsingId(id);
		   model.put("save", "Update");
		   model.put("url","addServiceProvider");
		 return new ModelAndView("editServiceProvider","command",serProv);
	}
	
	
	@RequestMapping(value = "/updateProvider", method = RequestMethod.POST)
	public ModelAndView updateProviderDetail(ModelMap model,@ModelAttribute("command") ServiceProvider serviceProvider) {
		if(srvcprointr.save(serviceProvider) != null) {
			model.put("succesfull", "Succefully Updated!!!");
			  List <ServiceProvider> getUserList=srvcprointr.findAll();
       	      model.put("serviceproviderList", getUserList);
		    return new ModelAndView("adminPage");
		}else {
			return new ModelAndView("editServiceProvider","command",new Users());
		}
	}
	
	
	@RequestMapping(value = "deleteEmployeeModal/{serviceId}", method=RequestMethod.GET)
    public  ModelAndView deleteProvider(@PathVariable(value="serviceId") int id,ModelMap model) {
		 adminservice.deleteServiceProvide(id);
		 model.put("succesfull", "Succefully Deleted!!!");
		 List <ServiceProvider> getUserList=srvcprointr.findAll();
  	      model.put("serviceproviderList", getUserList);
		 return new ModelAndView("adminPage");
	}
	
	
	
	@GetMapping("/addEmployeeModal")
  	private ModelAndView  addServiceProviderForm(ModelMap model) {
	    model.put("save", "Save");
	    model.put("url","addServiceProvider");
	   return new ModelAndView("editServiceProvider","command",new ServiceProvider());
    }

	@RequestMapping(value = "/addServiceProvider", method = RequestMethod.POST)
	public ModelAndView addProviderDetail(ModelMap model,@ModelAttribute("command") ServiceProvider serviceProvider) {
		if(srvcprointr.save(serviceProvider) != null) {
			model.put("succesfull", "Succefully Added!!!");
			  List <ServiceProvider> getUserList=srvcprointr.findAll();
       	      model.put("serviceproviderList", getUserList);
		    return new ModelAndView("adminPage");
		}else {
			return new ModelAndView("editServiceProvider","command",new Users());
		}
	}

}
