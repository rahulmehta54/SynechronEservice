package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.dto.Cart;
import com.example.demo.dto.ServiceMen;
import com.example.demo.dto.User;

@Repository
public interface CartDao {

	List<Cart> findCartItemsByUserId(User userData);

	int addItemToCart(User user, ServiceMen serviceMen);

	int removeFromCart(int cartId);
}
