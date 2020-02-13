package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Admin;
import com.example.demo.entity.Cart;
import com.example.demo.entity.ServiceProviderInfo;
import com.example.demo.entity.UserInfo;
import com.example.demo.entity.UserServiceProviderRelation;

@Configuration
public class WebConfig {

	@Bean
	public ModelAndView mdlView()
	{
		return new ModelAndView();
	}
	
	@Bean
	public UserInfo user()
	{
		return new UserInfo();
	}
	
	@Bean
	public Admin admin()
	{
		return new Admin();
	}
	
	@Bean
	public ServiceProviderInfo serviceProvider()
	{
		return new ServiceProviderInfo();
	}
	
	@Bean
	public UserServiceProviderRelation userServiceProviderRelation()
	{
		return new UserServiceProviderRelation();
	}
	
	@Bean
	public Cart cart()
	{
		return new Cart();
	}
}
