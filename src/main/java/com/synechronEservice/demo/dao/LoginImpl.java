package com.synechronEservice.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LoginImpl implements LoginInterFace {

	@Autowired
    private JdbcTemplate jdbcTemplateOne;
	
	@Override
	public boolean getUserCount() {
		String sql="select count(*) from Users";
		int resultCount=this.jdbcTemplateOne.queryForObject(sql, Integer.class);
		if(resultCount>0) {
			return true;
		}else {
			return false;
		}
	}

}
