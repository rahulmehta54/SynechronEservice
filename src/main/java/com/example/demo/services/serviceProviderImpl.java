package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Cart;
import com.example.demo.entity.ServiceProvider;
import com.example.demo.repo.cartRepo;
import com.example.demo.repo.serviceProviderRepo;

@Service
public class serviceProviderImpl {
	
	@Autowired
	serviceProviderRepo sprepo;
	
	@Autowired
	cartRepo crepo;
	
	public ServiceProvider addService(@Valid ServiceProvider sp)
	{
		return sprepo.save(sp);
	}
	
	public List<ServiceProvider> viewService()
	{
		return sprepo.findAll();
	}

	public Optional<ServiceProvider> getServbyId(int sid) {
		// TODO Auto-generated method stub
		return sprepo.findById(sid);
	}

	public ServiceProvider updateService(ServiceProvider srvp) {
		
		return sprepo.save(srvp);
	}

	public void deleteService(int sid) {
		
		sprepo.deleteById(sid);
		
	}

	public void addBooking(int sid, int userId) {

		//brepo.save(entity)
		
	}

	public Cart savetoCart(Cart c) {
		System.out.println("cart value "+c.getCartId()+" "+c.getS()+" "+c.getU());
		return crepo.save(c);
		
	}

	public List<Cart> getordersbyUserId(int userId) {
		return crepo.findByUseridAndSid(userId);
		
	}

	public List<Cart> viewCarbyId(int userId) {
		return crepo.findByUserId(userId);
		
	}

}
