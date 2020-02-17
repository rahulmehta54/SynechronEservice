package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Cart;
import com.example.demo.entity.Order;
import com.example.demo.entity.Serviceman;
import com.example.demo.repos.CartRepository;
import com.example.demo.repos.OrderRepository;

@Controller
public class CartController {

	@Autowired
	private Cart cart;

	@Autowired
	private Serviceman serviceman;

	@Autowired
	private CartRepository cartRepository;

	@Autowired
	private ModelAndView modelAndView;

	@Autowired
	private Order order;

	@Autowired
	private OrderRepository orderRepo;

	@GetMapping("/placeOrder/{cart_id}")
	public ModelAndView placeOrder(@PathVariable("cart_id") int cart_id) {

		modelAndView.addObject("command", order);
		modelAndView.addObject("cart", cartRepository.getOne(cart_id));
		modelAndView.setViewName("Order");
		return modelAndView;
	}

	@PostMapping("/addOrder")
	public ModelAndView addOrder(@ModelAttribute("command") Order order) {

		orderRepo.saveAndFlush(order);
		modelAndView.setViewName("successfullyOrdered");
		return modelAndView;

	}

}
