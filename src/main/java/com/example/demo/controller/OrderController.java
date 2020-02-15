package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dao.ServiceDaoJPA;
import com.example.demo.daoimpl.OrderDaoImpl;
import com.example.demo.dto.Order;
import com.example.demo.dto.ServiceMen;
import com.example.demo.dto.User;

@Controller
public class OrderController {

	@Autowired
	private ServiceMen serviceMen;

	@Autowired
	private OrderDaoImpl orderDaoImpl;

	@Autowired
	private ServiceDaoJPA serviceDaoJPA;

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

	@GetMapping("/addOrder/{sId}")
	public String addToCart(@PathVariable("sId") int sId, Model model, HttpSession session) {
		User userData = (User) session.getAttribute("userSession");
		System.out.println("Order Controller: /addOrder");
		System.out.println("session user data : " + userData);

		ServiceMen objServiceMen = serviceDaoJPA.findById(sId).get();
		System.out.println("ServiceMen Object By Id : ==========" + objServiceMen);

		int val = this.orderDaoImpl.addOrder(userData, objServiceMen);
		System.out.println("rows affected on adding:" + val);

		List<ServiceMen> allServiceMens = this.serviceDaoJPA.findAll();
		model.addAttribute("allServiceMens", allServiceMens);
		model.addAttribute("command", serviceMen);
		return "viewServiceMenUser";
	}

	@GetMapping("/order/cancel/{orderId}")
	public String removeOrder(@PathVariable("orderId") int orderId, Model model, HttpSession session) {
		int val = this.orderDaoImpl.cancelOrder(orderId);
		System.out.println("rows affected on updating order:" + val);

		User userData = (User) session.getAttribute("userSession");
		System.out.println("session user data : " + userData);
		List<Order> allOrders = this.orderDaoImpl.findOrdersByUserId(userData);
		model.addAttribute("allOrders", allOrders);
		return "viewOrders";
	}

//	@GetMapping("/addOrder/{sId}")
//	public String getServiceMenBeanById(@PathVariable("sId") int sId, Model model) {
//		System.out.println("edit - user id : ==========" + sId);
//		ServiceMen objServiceMen = serviceDaoJPA.findById(sId).get();
//		System.out.println("ServiceMen Object By Id : ==========" + objServiceMen);
//		model.addAttribute("command", objServiceMen);
//		return "editServiceMen";
//	}
//
//	@PostMapping("/updateServiceMen")
//	public String updateServiceMenById(@ModelAttribute("command") ServiceMen serviceMen, Model model) {
//		System.out.println("ServiceMen Updated object : ==========" + serviceMen);
//		this.serviceDaoJPA.save(serviceMen);
//		String nextPage = "viewServiceMen";
////		this.serviceMenDaoImpl.editServiceMen(serviceMen);
//		List<ServiceMen> allServiceMens = this.serviceDaoJPA.findAll();
//		model.addAttribute("allServiceMens", allServiceMens);
//		return nextPage;
//	}
}
