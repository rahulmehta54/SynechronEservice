package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Cart;
import com.example.demo.entity.ServiceMen;
import com.example.demo.repos.CartRepository;
import com.example.demo.repos.ServiceRepository;

@Controller
public class CartController {
	@Autowired
	private ModelAndView mdlAndView;
	
	@Autowired
	private CartRepository cartrepo;
	
	@Autowired
	private ServiceMen service;
	
	
	@Autowired
   private Cart cart;
	
	@GetMapping(value="/viewCart")
	public ModelAndView addtocart(@RequestParam("serviceId") int serviceId) {
		
		//System.out.println("delete user"+id);
		mdlAndView.addObject("serviceId", serviceId);
		System.out.println("----------------"+serviceId+" - "+cart);
		this.cartrepo.saveAndFlush(cart);
		
		  List<Cart> cartList= cartrepo.findAll();
		  System.out.println("==============="+cart); 
		  mdlAndView.addObject("cartList", cartList);
		  mdlAndView.addObject("command", cart);
		  mdlAndView.setViewName("viewCart");
		 
		
		return mdlAndView;
		
}
}
