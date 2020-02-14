package com.eservice.controller;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.omg.CORBA.UserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.eservice.config.Response;
import com.eservice.config.StatusSetting;
import com.eservice.model.Cart;
import com.eservice.model.Payment;
import com.eservice.model.User;
import com.eservice.service.CartService;
import com.eservice.service.OrderService;
import com.eservice.service.PaymentService;
import com.eservice.service.ServiceManService;

@Controller
public class OrderController {

	@Autowired
	private CartService cartService;

	@Autowired
	private ModelAndView modelAndView;

	@Autowired
	private Payment payment;

	@Autowired
	private PaymentService paymentService;

	@Autowired
	private StatusSetting statusSetting;

	@Autowired
	private ServiceManService serviceManService;

	@Autowired
	private OrderService orderService;

	@PostMapping("/placeOrder")
	public ResponseEntity<Response> placeOrder(@RequestBody Cart cart1) {
		try {

			Cart cart = new Cart();
			cart = cartService.findById(cart1.getId());
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

	@GetMapping("/orderList")
	public ModelAndView orderList(HttpSession session) {
		try {

			User userExists = new User();
			userExists = (User) session.getAttribute("userData");

			if (userExists != null && userExists.getRole().getId() == 2) {
				modelAndView.setViewName("orderList");

				System.out.println("order list=" + orderService.findByUserId(userExists.getId()));

				modelAndView.addObject("list", orderService.findByUserId(userExists.getId()));
			} else {
				modelAndView.addObject("list", orderService.findAll());
				modelAndView.setViewName("orderList");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return modelAndView;
	}

}
