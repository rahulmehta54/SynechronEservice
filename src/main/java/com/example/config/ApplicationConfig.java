package com.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ModelAndView;

@Configuration
public class ApplicationConfig {

	@Autowired
	public ModelAndView modelAndView;
	
	
}
