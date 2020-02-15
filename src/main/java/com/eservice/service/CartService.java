package com.eservice.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eservice.model.Cart;
import com.eservice.model.ServiceMan;
import com.eservice.repository.CartRepo;

@Service
public class CartService {

	@Autowired
	private CartRepo cartRepo;
	
	public Cart addCart(Cart cart) {
		return cartRepo.saveAndFlush(cart);
	}
	
	public List<Cart> findByStatus(int status){
		return cartRepo.findByStatus(status);
	}
	
	@Transactional
	public int updateStatus(int status, long cartId) {
		return cartRepo.updateStatus(status, cartId);
	}
	
	public Cart findById(long id) {
		return cartRepo.getOne(id);		
	}
}
