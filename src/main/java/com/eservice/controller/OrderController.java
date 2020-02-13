package com.eservice.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.eservice.config.Response;
import com.eservice.model.Cart;
import com.eservice.service.CartService;

@Controller
public class OrderController {

	@Autowired
	private CartService cartService;

	@Autowired
	private ModelAndView modelAndView;

	@GetMapping("/placeOrder/{cartId}")
	public ResponseEntity<Response> placeOrder(@PathVariable("cartId") long cartId) {
		try {

			Cart cart = new Cart();
			cart = cartService.findById(cartId);
			if (cart == null) {
				return new ResponseEntity<Response>(new Response("Cart Not Present."), HttpStatus.OK);
			} else {
				return new ResponseEntity<Response>(new Response("success"), HttpStatus.OK);
			}

		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Response>(new Response("Failed. Please try again."), HttpStatus.OK);
		}

	}

	@GetMapping("/payment/{cartId}")
	public ModelAndView payment(@PathVariable("cartId") long cartId) {
		try {
			modelAndView.setViewName("payment");
			modelAndView.addObject("command", cartService.findById(cartId));
			modelAndView.addObject("cart", cartService.findById(cartId));
			return modelAndView;
		} catch (Exception e) {
			e.printStackTrace();
			return modelAndView;
		}

	}

}
