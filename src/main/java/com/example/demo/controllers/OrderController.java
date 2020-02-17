package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Order;
import com.example.demo.repos.OrderRepository;

@Controller
public class OrderController {

	@Autowired
	private Order order;

	@Autowired
	private ModelAndView modelAndView;

	@Autowired
	private OrderRepository orderRepository;

	@PostMapping("/successfullyOrdered/{order_Id}")
	public ModelAndView successfullyOrdered(@PathVariable("order_Id") int order_Id) {
		orderRepository.getOne(order_Id);
		modelAndView.addObject("order", orderRepository.getOne(order_Id));
		return modelAndView;
	}
}
