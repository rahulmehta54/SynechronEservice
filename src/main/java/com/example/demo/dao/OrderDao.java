package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.dto.Cart;
import com.example.demo.dto.Order;
import com.example.demo.dto.User;

@Repository
public interface OrderDao {
	List<Order> findOrdersByUserId(User userData);
}
