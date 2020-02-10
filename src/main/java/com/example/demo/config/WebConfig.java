package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.ServiceProviderInfo;
import com.example.demo.entity.UserInfo;

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
	public ServiceProviderInfo serviceProvider()
	{
		return new ServiceProviderInfo();
	}
	
	
}
