package com.example.demo.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.controller.repository.FinalOrderRepo;
import com.example.demo.entity.Cart;
import com.example.demo.entity.EndOrder;
import com.example.demo.entity.Finalcart;
import com.example.demo.entity.Order;
import com.example.demo.entity.OrderAndServiceman;
import com.example.demo.entity.SalesPerson;
import com.example.demo.entity.User;
import com.example.demo.entity.FinalOrder;
@Configuration
public class WebConfig {
	@Bean
	public ModelAndView mdlView() {
		return new ModelAndView();
	}
    @Bean

    public Finalcart     finalcart() {
		return new Finalcart();
	}

    @Bean

    public EndOrder     endOrder() {
		return new EndOrder();
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
	@Bean
	public Cart cart() {
		return new Cart();
	}

	@Bean
	public FinalOrder  FinalOrder() {
		return new FinalOrder();
	}
	
	

	

}
