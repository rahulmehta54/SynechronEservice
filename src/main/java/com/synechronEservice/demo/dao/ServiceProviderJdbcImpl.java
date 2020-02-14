package com.synechronEservice.demo.dao;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.synechronEservice.demo.constants.ApplicationConstant;
import com.synechronEservice.demo.models.ServiceProvider;


@Repository
public class ServiceProviderJdbcImpl {
	@Autowired
    private JdbcTemplate jdbcTemplateOne;

	public boolean paymentFormSubmission(String datetime, int userid, int[] serviceid, boolean isPaymentSuccesfull) {
		// TODO Auto-generated method stub
		for(int i=0;i<serviceid.length;i++) {
			System.out.println("dt"+datetime);
			   Object[] params = new Object[] {datetime , isPaymentSuccesfull,userid, serviceid[i] };
			   jdbcTemplateOne.update(ApplicationConstant.INSERT_DATA_INTO_USP, params);
		}
		return true;
	}
	
	


	
	
	

}
