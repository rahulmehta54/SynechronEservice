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

import com.example.demo.dao.OrderDaoJPA;
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

	@Autowired
	private OrderDaoJPA orderDaoJPA;

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

	/**
	 * Cancel Order
	 * 
	 * @param orderId
	 * @param model
	 * @param session
	 * @return
	 */
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

	/**
	 * Method to open add order form
	 * 
	 * @param sId
	 * @param model
	 * @param session
	 * @return
	 */
	@GetMapping("/viewOrderForm/{sId}")
	public String viewOrderForm(@PathVariable("sId") int sId, Model model, HttpSession session) {
		ServiceMen objServiceMen = serviceDaoJPA.findById(sId).get();
		System.out.println("ServiceMen Object By Id : ==========" + objServiceMen);
		User userData = (User) session.getAttribute("userSession");
		Order orderObj = this.orderDaoImpl.getServiceMenDataInOder(objServiceMen);
		orderObj.setUserId(userData.getUserId());
		System.out.println("Order Object From Servicemen Obj : ==========" + orderObj);
		model.addAttribute("command", orderObj);
		return "addOrder";
	}

	/**
	 * Method to place an order
	 * 
	 * @param orderObj
	 * @param model
	 * @param session
	 * @return
	 */
	@PostMapping("/placeOrder")
	public String updateOrderById(@ModelAttribute("command") Order orderObj, Model model, HttpSession session) {
		System.out.println("Order Updated object : ==========" + orderObj);
		this.orderDaoJPA.saveAndFlush(orderObj);

		User userData = (User) session.getAttribute("userSession");
		System.out.println("session user data " + userData);
		List<Order> allOrders = this.orderDaoImpl.findOrdersByUserId(userData);
		model.addAttribute("allOrders", allOrders);
		return "viewOrders";
	}
}
