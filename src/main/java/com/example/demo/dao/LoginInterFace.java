package com.example.demo.dao;

import org.springframework.stereotype.Repository;


public interface LoginInterFace {

	boolean isValidUser(String emailId,String pwd);
}
