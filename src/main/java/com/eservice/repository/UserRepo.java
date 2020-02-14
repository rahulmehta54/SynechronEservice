package com.eservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eservice.model.User;

public interface UserRepo extends JpaRepository<User, Long>{

	public User findByUserNameAndPassword(String userName, String password);
	
}
