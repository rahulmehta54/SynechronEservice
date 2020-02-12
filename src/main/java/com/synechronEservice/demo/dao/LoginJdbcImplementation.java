package com.synechronEservice.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.synechronEservice.demo.constants.ApplicationConstant;

@Repository
public class LoginJdbcImplementation {

	@Autowired
    private JdbcTemplate jdbcTemplateOne;
	
	
	public boolean getUserCount(String useremail, String password) {
		int resultCount=this.jdbcTemplateOne.queryForObject(ApplicationConstant.GET_VALID_USER_COUNT,new Object[] { useremail,password }, Integer.class);
		System.out.println(resultCount);
		if(resultCount>0) {
			return true;
		}else {
			return false;
		}
	}
	public boolean isUserIsAdmin(String emailIId, String password) {
		// TODO Auto-generated method stub
		int resultCount=this.jdbcTemplateOne.queryForObject(ApplicationConstant.GET_VALID_ADMIN_COUNT,new Object[] { emailIId,password }, Integer.class);
		System.out.println(resultCount);
		if(resultCount>0) {
			return true;
		}else {
			return false;
		}
	}

}
