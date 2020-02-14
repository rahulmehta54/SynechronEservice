package com.synechronEservice.demo.services;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.synechronEservice.demo.dao.LoginInterface;
import com.synechronEservice.demo.dao.LoginJdbcImplementation;
import com.synechronEservice.demo.models.Users;

@Service
public class LoginServices {
	@Autowired
	LoginJdbcImplementation loginImp;
	
	@Autowired
	LoginInterface logInt;

	public boolean isAuthUser(String username, String password) {
		// TODO Auto-generated method stub
		return loginImp.getUserCount(username, password);
	}
   
	public boolean isAdmin(String emailIId, String password) {
		// TODO Auto-generated method stub
		return loginImp.isUserIsAdmin(emailIId,password);
	}

	public Users getUserDetail(String emailIId, String password) {
	
		return logInt.findByEmailIdAndPassWord(emailIId, password);
	}
}
