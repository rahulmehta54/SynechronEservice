package com.example.demo.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Admin;
import com.example.demo.entity.ServiceMen;
import com.example.demo.entity.User;



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
	public Admin admin()
	{
		return new Admin();
	}
	
	
	@Bean
	public ServiceMen smen()
	{
		return new ServiceMen();
	}


}
