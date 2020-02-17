package com.example.demo.Service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ServiceProvider;
import com.example.demo.entity.User;
import com.example.demo.repo.UserRepository;

@Service
public class UserServiceImpl {

	@Autowired
	UserRepository urepo;

	public User checkUser(@Valid User u) {
		return urepo.findByEmailIDAndUserPasswordAndRole(u.getEmailID(), u.getUserPassword(), u.getRole());
		
	}
	
	public User registerUser(User u) {
		 User u1 = urepo.save(u);
		 return u;
	}
	
	
}
