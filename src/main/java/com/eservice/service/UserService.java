package com.eservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eservice.model.User;
import com.eservice.repository.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo repo;

	public User addUser(User user) {
		return repo.saveAndFlush(user);
	}

	public User checkLogin(User user) {

		return repo.findByEmailAndPassword(user.getEmail(), user.getPassword());

	}

}
