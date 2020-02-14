package com.example.demo.config;

import java.util.List;
import java.util.Optional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Admin;
import com.example.demo.entity.Booked;
import com.example.demo.entity.Cart;
import com.example.demo.entity.ServiceProviderInfo;
import com.example.demo.entity.UserInfo;
import com.example.demo.entity.UserServiceProviderRelation;
import com.example.demo.repos.BookedRepository;

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
	
	@Bean
	public Booked booked()
	{
		return new Booked();
	}
	
}
