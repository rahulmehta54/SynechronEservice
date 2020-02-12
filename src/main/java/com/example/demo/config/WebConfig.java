package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.entity.ServiceProvider;
import com.example.demo.entity.Users;


@Configuration
public class WebConfig {
	@Bean
	public Users u() {
		return new Users();
	}
	@Bean
	public ServiceProvider sp() {
		return new ServiceProvider();
	}
}
