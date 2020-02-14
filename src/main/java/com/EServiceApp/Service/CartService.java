package com.EServiceApp.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EServiceApp.entity.Cart;
import com.EServiceApp.repo.CartRepository;

@Service
public class CartService {

	@Autowired
	private CartRepository repo;

	public Cart addToCart(Cart cart) {

		return repo.saveAndFlush(cart);
	}

	public List<Cart> findByStatus(int status) {
		return repo.findByStatus(status);
	}

	@Transactional
	public int deleteById(int status, long cartid) {
	
		return repo.deleteById(status, cartid);
		
	}


}
