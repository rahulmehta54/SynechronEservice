package com.example.demo.dao;

import org.springframework.stereotype.Repository;
import com.example.demo.dto.User;

@Repository
public interface UserDao {
	int loginUser(User user);
}
