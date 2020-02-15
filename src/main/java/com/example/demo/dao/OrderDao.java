package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.dto.Order;
import com.example.demo.dto.ServiceMen;
import com.example.demo.dto.User;

@Repository
public interface OrderDao {

	List<Order> findOrdersByUserId(User userData);

	int addOrder(User user, ServiceMen serviceMen);

	int cancelOrder(int orderId);
}
