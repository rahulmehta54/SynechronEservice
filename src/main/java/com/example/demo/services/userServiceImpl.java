package com.example.demo.services;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Users;
import com.example.demo.repo.userRepository;

@Service
public class userServiceImpl {

	@Autowired
	userRepository urepo;

	public Users checkUser(@Valid Users u) {
		return urepo.findByMailIdAndPasswordAndRole(u.getMailId(), u.getPassword(), u.getRole());
		
	}
	
	
	
	
}
