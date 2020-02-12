package com.synechronEservice.demo.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.ModelAndView;

import com.synechronEservice.demo.models.ServiceProvider;
import com.synechronEservice.demo.models.Users;

@Configuration
public class DataBaseConfig {

	@Bean
	public ModelAndView mdlView() {
		return new ModelAndView();
	}

	@Bean
	public Users user() {
		return new Users();
	}
	
	@Bean
	public ServiceProvider serviceProvider() {
		return new ServiceProvider();
	}
}
