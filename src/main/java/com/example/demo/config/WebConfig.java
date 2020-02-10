package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dto.Cart;
import com.example.demo.dto.Order;
import com.example.demo.dto.ServiceMen;
import com.example.demo.dto.User;

@Configuration
public class WebConfig {

	@Bean
	public ModelAndView mdlView() {
		return new ModelAndView();
	}

	@Bean
	public User user() {
		return new User();
	}

	@Bean
	public Order order() {
		return new Order();
	}

	@Bean
	public ServiceMen serviceMen() {
		return new ServiceMen();
	}

	@Bean
	public Cart cart() {
		return new Cart();
	}
}
