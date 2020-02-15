package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.example.demo.dto.User;

@Repository
public interface UserDao {
	
	List<User> loginUserData(User user);
}
