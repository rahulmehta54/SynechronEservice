package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;

@Repository
public interface UserDao {

	public int loginUser(User user);

	public User getDataOfUser(User user);

//	public List<User> getAllEmployeesRowMapper();
}
