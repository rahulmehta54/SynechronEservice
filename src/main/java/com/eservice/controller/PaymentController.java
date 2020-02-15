package com.eservice.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.eservice.model.Payment;
import com.eservice.model.ServiceMan;
import com.eservice.model.User;
import com.eservice.repository.PaymentRepo;
import com.eservice.service.PaymentService;

public class PaymentController {

	
	/*
	 * @Autowired private Payment payment;
	 * 
	 * @Autowired private PaymentService paymentService;
	 * 
	 * @Autowired private PaymentRepo paymentRepo;
	 * 
	 * @Autowired private User user;
	 * 
	 * @Autowired private ServiceMan serviceMan;
	 * 
	 * @Autowired private ModelAndView modelAndView;
	 * 
	 * @GetMapping public ModelAndView getPaymentForm(@RequestParam("cartId") long
	 * cartId, HttpSession session) { user = (User)session.getAttribute("userData");
	 * payment.setUser(user);
	 * 
	 * return null;
	 * 
	 * }
	 */
}
