package com.eservice.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eservice.model.Order;
import com.eservice.repository.OrderRepo;

@Service
public class OrderService {

	@Autowired
	private OrderRepo repo;

	public Order addOrder(Order order) {

		System.out.println("order" + order);

		return repo.saveAndFlush(order);
	}

	public List<Order> findByUserId(long userId) {
		return repo.findByUserId(userId);
	}

	@Transactional
	public int updateOrderStatus(String status, long id) {
		return repo.updateStatus(status, id);
	}

	public Order findById(long id) {
		return repo.getOne(id);
	}

	public List<Order> findAll() {
		return repo.findAll();
	}

}
