package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.LoginImplementation;


@Service
public class LoginService {

	
	@Autowired
	LoginImplementation loginimpl;
	
	
	public boolean isValidUser(String emailId, String pwd) {
		return loginimpl.isValidUser(emailId, pwd);
		// TODO Auto-generated method stub
	}
	
	
	
	
	

}
