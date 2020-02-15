package com.eservice.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.eservice.model.Cart;
import com.eservice.model.Order;
import com.eservice.repository.OrderRepo;

public class OrderService {

	@Autowired
	private OrderRepo orderRepo;
	
	public Order addOrder(Order order) {
		return orderRepo.saveAndFlush(order);
	}
}
