package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Order;
import com.example.demo.repos.OrderRepository;

@Controller
public class OrderController {

	@Autowired
	private ModelAndView mdlView;
	
	@Autowired
	private OrderRepository orderepo;
	
	@Autowired
	private Order order;
	
//	public String initOrder() {
//		
//	}
}
