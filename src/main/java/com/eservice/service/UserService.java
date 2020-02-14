package com.eservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eservice.model.User;
import com.eservice.repository.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;
	
	public User addUser(User user) {
		return userRepo.saveAndFlush(user);
	}
	
	public User checkLogin(User user) {
		return userRepo.findByUserNameAndPassword(user.getUserName(), 
				user.getPassword());
	}

	public User onSubmit(User user) {
		return userRepo.saveAndFlush(user);
	}

	public User findByUserNameAndPassword(User user) {
		return userRepo.findByUserNameAndPassword(user.getUserName(), user.getPassword());
	}
}
