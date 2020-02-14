package com.eservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ModelAndView;

import com.eservice.model.Category;
import com.eservice.model.InspectionCharge;
import com.eservice.model.User;
import com.eservice.service.InspectionChargeService;

@Configuration
public class EserviceConfig {

	@Bean
	public ModelAndView modelAndView() {
		return new ModelAndView();
	}
	
	@Bean
	public User user() {
		return new User();
	}
	
	@Bean
	public Category category() {
		return new Category();
	}
	
	@Bean
	public InspectionCharge inspectionCharge() {
		return new InspectionCharge();
	}

	
	

}
