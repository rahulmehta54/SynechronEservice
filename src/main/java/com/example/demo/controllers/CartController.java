package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Cart;
import com.example.demo.entity.Serviceman;
import com.example.demo.repos.CartRepository;

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

	
}
