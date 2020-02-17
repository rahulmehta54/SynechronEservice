package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Cart;
import com.example.demo.repo.Cart_repo;

@Service
public class CartService_Imple {

	@Autowired
	Cart_repo cartRepo;
	
	
	public Cart addToCart(Cart cart)
	{
	   return cartRepo.save(cart); 
	}
	
	
	
	  public List<Cart> GetAllItemsFromCart(int UserID) 
	  { 
		  return cartRepo.getAllCartIteams(UserID); 
	  }
	 
	 
	
}
