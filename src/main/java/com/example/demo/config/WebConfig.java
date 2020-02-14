package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Order;
import com.example.demo.entity.OrderAndServiceman;
import com.example.demo.entity.SalesPerson;
import com.example.demo.entity.User;
@Configuration
public class WebConfig {
	@Bean
	public ModelAndView mdlView() {
		return new ModelAndView();
	}
	@Bean
	public User  user() {
		return new User();
	}
	@Bean
	public SalesPerson  salesPerson() {
		return new SalesPerson ();
	}
	
	@Bean
	public OrderAndServiceman  OrderServicemen() {
		return new OrderAndServiceman ();
	}
	@Bean
	public Order order() {
		return new Order();
	}
	

	

}
