package com.example.demo.dao;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;

@Repository
public interface UserDao {

	public int loginUser(User user);
}
