package com.synechronEservice.demo.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.synechronEservice.demo.models.ServiceProvider;
import com.synechronEservice.demo.models.UserServiceProviderBookingTracker;
import com.synechronEservice.demo.models.Users;
import com.synechronEservice.demo.services.AdminServices;
import com.synechronEservice.demo.services.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userservice;
	@Autowired
	AdminServices adminservice;
	
	@Autowired
	UserServiceProviderBookingTracker uspt;

	@RequestMapping(value="/searchProvider", method = RequestMethod.POST)
	public String showSerchResult(ModelMap model,@RequestParam String service, @RequestParam String location){
		List<ServiceProvider> li =userservice.getDetailsOnTheBasis(service,location);
		model.put("serviceproviderList", li);
		model.put("service", service);
		model.put("city", location);
		return "providerList";
	}

	@RequestMapping(value = "/addTocart", method=RequestMethod.POST)
	public  String addToCart(HttpSession session,@RequestParam("providerid") int[] checkboxValue ,ModelMap model) {
		List<ServiceProvider> servcProvider=null;
		String page="";
		if(checkboxValue.length>0) {
				servcProvider=userservice.addToCheckOutPage(checkboxValue);
				model.put("serviceproviders", servcProvider);
				model.put("userid", session.getAttribute("userid"));
				page="checkoutPage";
         }else {
		     	model.put("error","No Service Provider Found");
			    page="providerList";
		    }
		return page;
	}
	
	
	@RequestMapping(value = "/checkoutPayment", method=RequestMethod.POST)
	public  String paymentForm(@RequestParam("serviceid") int[] serviceid,@RequestParam("userid") int userid , @RequestParam("exp") String exp, @RequestParam("cnumber") String cnumber
			,@RequestParam("datetime") String datetime,ModelMap model) {
		
		
		boolean isPaymentSuccesfull=true;
		userservice.paymentFormSubmission(datetime,userid,serviceid,isPaymentSuccesfull);
		model.put("error","No Service Provider Found");
		return "providerList";
		
	}
}
