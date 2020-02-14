package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.demo.daoimpl.OrderDaoImpl;
import com.example.demo.dto.Order;
import com.example.demo.dto.User;

@Controller
public class OrderController {

	@Autowired
	private Order order;

	@Autowired
	private OrderDaoImpl orderDaoImpl;

	/**
	 * Get All Orders By User Id
	 * 
	 * @param model
	 * @param session
	 * @return
	 */
	@GetMapping("/viewOrders")
	public String viewOrderForm(Model model, HttpSession session) {
		User userData = (User) session.getAttribute("userSession");
		System.out.println("session user data " + userData);
		List<Order> allOrders = this.orderDaoImpl.findOrdersByUserId(userData);
		model.addAttribute("allOrders", allOrders);
		return "viewOrders";
	}
}
