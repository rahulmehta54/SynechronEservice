package com.synechronEservice.demo.services;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class LoginServices {
	@Autowired
    private JdbcTemplate jdbcTemplateOne;
}
