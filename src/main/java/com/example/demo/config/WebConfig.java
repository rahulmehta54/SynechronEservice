package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.entity.Address;
import com.example.demo.entity.Cart;
import com.example.demo.entity.OrderBooked;
import com.example.demo.entity.ServiceProvider;
import com.example.demo.entity.Users;


@Configuration
public class WebConfig {
	@Bean
	public Users u() {
		return new Users();
	}
	@Bean
	public Address adr() {
		return new Address();
	}
	@Bean
	public ServiceProvider sp() {
		return new ServiceProvider();
	}
	
	@Bean
	public Cart c()
	{
		return new Cart();
	}
	
	@Bean
	public OrderBooked ob() {
		return new OrderBooked();
	}
}
