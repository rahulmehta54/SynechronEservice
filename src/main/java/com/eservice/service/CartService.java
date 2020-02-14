package com.eservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eservice.model.Cart;
import com.eservice.repository.CartRepo;

@Service
public class CartService {

	@Autowired
	private CartRepo cartRepo;
	
	public Cart addCart(Cart cart) {
		return cartRepo.saveAndFlush(cart);
	}
}
