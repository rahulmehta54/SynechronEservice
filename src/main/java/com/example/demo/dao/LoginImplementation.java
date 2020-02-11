package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LoginImplementation implements LoginInterFace {
    @Autowired
	JdbcTemplate jdbctemplate;
	@Override
	public boolean isValidUser(String emailId, String pwd) {
		// TODO Auto-generated method stub
		System.out.println("helllllllllooooooooo");
		String sql="select count(*) from user where emailId= ? and pwd=?";
		int resultcount=jdbctemplate.queryForObject(sql, new Object[]{emailId,pwd}, Integer.class);
		System.out.println(resultcount);
		if(resultcount>0) {
			System.out.println("true");
			return true;
		}else {
			System.out.println("false");
			return false;
		}
	}

}
