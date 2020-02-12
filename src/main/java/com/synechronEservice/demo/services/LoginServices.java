package com.synechronEservice.demo.services;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.synechronEservice.demo.dao.LoginJdbcImplementation;

@Service
public class LoginServices {
	@Autowired
	LoginJdbcImplementation loginImp;

	public boolean isAuthUser(String username, String password) {
		// TODO Auto-generated method stub
		return loginImp.getUserCount(username, password);
	}
   
	public boolean isAdmin(String emailIId, String password) {
		// TODO Auto-generated method stub
		return loginImp.isUserIsAdmin(emailIId,password);
	}
}
