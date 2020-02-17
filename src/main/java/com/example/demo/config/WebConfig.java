package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.entity.Cart;

import com.example.demo.entity.ServiceProvider;
import com.example.demo.entity.User;

@Configuration
public class WebConfig {


		@Bean
		public User user()
		{
			return new User();
		}
		
		@Bean
		public ServiceProvider sp()
		{
			return new ServiceProvider();
		}
		@Bean
		public Cart cart() {
			return new Cart();
		}
		
		
	
}


