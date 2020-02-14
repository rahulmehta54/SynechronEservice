package com.eservice.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eservice.model.Cart;
import com.eservice.repository.CartRepo;

@Service
public class CartService {

	@Autowired
	private CartRepo cartRepo;

	public Cart addToCart(Cart cart) {
		return cartRepo.saveAndFlush(cart);
	}

	public Cart findbyUserIdAndServiceProviderId(long userId, long serviceProviderId) {
		return cartRepo.findByUserIdAndServiceProviderId(userId, serviceProviderId);
	}

	public List<Cart> findByStatus(int status) {
		return cartRepo.findByStatus(status);
	}

	public Cart findById(long id) {
		return cartRepo.getOne(id);
	}

	@Transactional
	public int updateStatus(int status, long id) {
		return cartRepo.updateStatus(status, id);
	}

}
