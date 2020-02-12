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
		String sql="select count(*) from user where emailId= ? and pwd=?";
		int resultcount=jdbctemplate.queryForObject(sql, new Object[]{emailId,pwd}, Integer.class);
		System.out.println(resultcount);
		if(resultcount>0) {
			return true;
		}else {
			
			return false;
		}
	}
	public boolean isValidAdmin(String userId,String pwd) {
		String sql = "select count(*) from admin where userId = ? and pwd = ?";
		int rc = jdbctemplate.queryForObject(sql, new Object[] {userId,pwd}, Integer.class );
		if(rc > 0) {
			return true;
		}
		else {
			return false;
		}
	}

}
