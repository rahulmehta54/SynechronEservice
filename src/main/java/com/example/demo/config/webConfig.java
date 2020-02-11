package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


	@Configuration
	public class webConfig {

		@Bean
		public ModelAndView mdlView() {
			return new ModelAndView();
		}

		@Bean
		public User user() {
			return new User();
		}

		@Bean
		public Order order() {
			return new Order();
		}

		@Bean
		public ServiceMen serviceMen() {
			return new ServiceMen();
		}

		@Bean
		public Cart cart() {
			return new Cart();
		}
	}
}
