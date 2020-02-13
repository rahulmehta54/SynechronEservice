package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Cart;
import com.example.demo.entity.Order;
import com.example.demo.entity.Service;
import com.example.demo.entity.User;

@Configuration
public class WebConfig {

	@Bean
	public ModelAndView mdlAndView() {
		return new ModelAndView();
	}

	@Bean
	public Order order() {
		return new Order();
	}

	@Bean
	public Cart cart() {
		return new Cart();
	}

	@Bean
	public User user() {
		return new User();
	}

	@Bean
	public Service service() {
		return new Service();
	}

	
}
