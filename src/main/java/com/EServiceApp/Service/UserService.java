package com.EServiceApp.Service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EServiceApp.entity.User;
import com.EServiceApp.repo.UserRepository;
@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public User findByUserNameAndPassword(User user)
	{
		return repo.findByUserNameAndPassword(user.getUserName(), user.getPassword());
	}
	/*
	 * public User saveUser(User user) { return repo.save(user); }
	 */
	
	public User register(User user) {
		
		return repo.saveAndFlush(user);
	}
}
