package com.synechronEservice.demo.dao;

public interface LoginInterFace {

	boolean getUserCount(String useremail, String password);
	boolean isUserIsAdmin(String emailIId, String password);
}
