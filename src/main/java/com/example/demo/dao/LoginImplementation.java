package com.example.demo.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LoginImplementation implements LoginInterFace {

	JdbcTemplate jdbctemplate;
	@Override
	public boolean isValidUser(String emailId, String pwd) {
		// TODO Auto-generated method stub
		String sql="select count(*) from user where emailId= ? and pwd=?";
		int resultcount=jdbctemplate.queryForObject(sql, new Object[]{emailId,pwd}, Integer.class);
		if(resultcount>0) {
			return true;
		}else {
			return false;
		}
	}

}
