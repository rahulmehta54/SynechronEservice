package com.eservice.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.eservice.model.Cart;
import com.eservice.model.Order;
import com.eservice.model.Payment;
import com.eservice.model.ServiceMan;
import com.eservice.model.User;
import com.eservice.repository.PaymentRepo;
import com.eservice.service.CartService;
import com.eservice.service.CategoryService;
import com.eservice.service.OrderService;
import com.eservice.service.PaymentService;
import com.eservice.service.ServiceManService;

public class OrderController {

	@Autowired
	private Order order;
	
	@Autowired
	private PaymentService paymentService;
	
	@Autowired
	private PaymentRepo paymentRepo;
	
	@Autowired 
	private User user;
	
	@Autowired
	private ServiceMan serviceMan;
	
	@Autowired
	private ServiceManService serviceManService;
	
	@Autowired
	private ModelAndView modelAndView;
	
	@Autowired
	private CartService cartService;
	
	@Autowired
	private OrderService orderService;
	
	@Autowired
	private Cart cart;
	
	@Autowired
	private CategoryService categoryService;

	
	@GetMapping
	public ModelAndView getPaymentForm(@RequestParam("cartId") long cartId, HttpSession session) {
		cart = cartService.findById(cartId);
		user = (User)session.getAttribute("userData");
		order.setUser(user);
		order.setServiceMan(serviceManService.findById(cartId));
		order.setCart(cartService.findById(cartId));
		orderService.addOrder(order);
		modelAndView.addObject("cartId", cartId);
		modelAndView.setViewName("addPayment");
		modelAndView.addObject("command", cart);
		modelAndView.addObject("cart", cart);
		modelAndView.addObject("categoryList", categoryService.findByStatus(1));
		modelAndView.addObject("cartList", cartService.findByStatus(1));
		return modelAndView;
		
	}
}
