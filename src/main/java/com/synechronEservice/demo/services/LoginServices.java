package com.synechronEservice.demo.services;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class LoginServices {
	@Autowired
    private JdbcTemplate jdbcTemplateOne;

	public boolean validateUser(String userid, String password) {
		// TODO Auto-generated method stub
		  
		 return userid.equalsIgnoreCase("in28minutes")
	                && password.equalsIgnoreCase("dummy");
	}
}
