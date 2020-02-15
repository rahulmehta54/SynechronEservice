package com.eservice.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.eservice.model.Cart;
import com.eservice.model.ServiceMan;
import com.eservice.model.User;
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
	
	@Autowired
	private ServiceMan serviceMan;
	
	
	@GetMapping("addToCart")
	public ModelAndView addServiceToCart(@RequestParam("serviceId") long serviceId, HttpSession session) {
		
		user = (User)session.getAttribute("userData");
		cart.setStatus(1);
		cart.setServiceMan(serviceManService.findById(serviceId));
		cart.setUser(user);
		cartService.addCart(cart);
		modelAndView.addObject("serviceId", serviceId);
		modelAndView.setViewName("serviceManList");
		modelAndView.addObject("command", serviceMan);
		modelAndView.addObject("serviceManList", serviceManService.findByStatus(1));
		return modelAndView;	
	}
	
	@GetMapping("cartList")
	public String showCartList(Model model) {
		model.addAttribute("command", cart);
		model.addAttribute("cartList", cartService.findByStatus(1));
		return "cartList";
		
	}
	
	@GetMapping("deleteCart")
	public String deleteServiceMan(Model model, @RequestParam("id") long cartId) {
		cartService.updateStatus(0, cartId);
		model.addAttribute("cartId", cartId);
		model.addAttribute("command", cart);
		model.addAttribute("cartList", cartService.findByStatus(1));
		return "cartList";
	}
}
