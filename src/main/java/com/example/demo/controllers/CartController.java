package com.example.demo.controllers;

import java.nio.channels.SeekableByteChannel;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Cart;
import com.example.demo.entity.Order;
import com.example.demo.entity.ServiceMen;
import com.example.demo.entity.User;
import com.example.demo.repos.CartRepository;
import com.example.demo.repos.OrderRepository;
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
    private	ServiceRepository servicerepo;
	
	@Autowired
   private Cart cart;
	
	private OrderRepository orderrepo;
	
	/*@GetMapping(value="/viewCart")
	public ModelAndView addtocart(@RequestParam("serviceId") int serviceId) {
		System.out.println("----------serviceId-----------"+serviceId);
		
		//System.out.println("delete user"+id);
		
		ServiceMen one = servicerepo.getOne(serviceId);
		cart.setService(one);
		
		User user=new User();
		return mdlAndView;*/
		
		
		
		
		
//		this.cartrepo.saveAndFlush(cart);
		
//		  List<Cart> cartList= cartrepo.findAll();
//		  System.out.println("==============="+cart); 
//		  mdlAndView.addObject("cartList", serviceId);
		//  mdlAndView.addObject("command", cart);
//		  mdlAndView.setViewName("viewCart");
		 
		
//		return mdlAndView;
	
	@GetMapping("/placeOrder/{cartId}")
	public ModelAndView placeOrder(@PathVariable("cartId")int cart_id) {
		mdlAndView.addObject("cart",cartrepo.getOne(cart_id));
		mdlAndView.setViewName("order"); 
		return mdlAndView;
		
	}
	
	@PostMapping("/viewOrder")
	public ModelAndView addOrder(@ModelAttribute("command")Cart cart) {
		System.out.println("===cart details====="+cart);
		
		//orderrepo.saveAndFlush(order);
		mdlAndView.setViewName("successOrder");
		return mdlAndView;
		
	}
	
}
