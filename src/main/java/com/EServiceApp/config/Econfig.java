package com.EServiceApp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ModelAndView;
@Configuration
public class Econfig {

	@Bean
	public ModelAndView mdlview()
	{
		return new ModelAndView();
		
	}
	
}
