package com.eservice.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.eservice.model.Cart;
import com.eservice.model.ServiceMan;
import com.eservice.model.User;
import com.eservice.repository.CartRepo;
import com.eservice.service.CartService;
import com.eservice.service.ServiceManService;

@Controller
public class CartController {

	@Autowired
	private Cart cart;
	
	@Autowired
	private CartService cartService;
	
	@Autowired
	private ModelAndView modelAndView;
	
	@Autowired
	private ServiceManService serviceManService;
	
	@Autowired
	private User user;
	
	
	@GetMapping("addToCart")
	public ModelAndView addServiceToCart(@RequestParam("serviceId") long serviceId, HttpSession session) {
		
		user = (User)session.getAttribute("userData");
		/*Cart newCart = new Cart();*/
		cart.setStatus(1);
		cart.setServiceMan(serviceManService.findById(serviceId));
		cart.setUser(user);
		cartService.addCart(cart);
		modelAndView.addObject("serviceId", serviceId);
		modelAndView.setViewName("serviceManList");
		return modelAndView;	
	}
}
