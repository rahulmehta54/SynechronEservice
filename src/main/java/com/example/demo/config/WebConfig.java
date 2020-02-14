package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ModelAndView;

@Configuration
public class WebConfig {

	@Bean
	public ModelAndView modelAndView() {
		return new ModelAndView();
	}
}
