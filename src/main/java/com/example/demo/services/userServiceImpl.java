package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Address;
import com.example.demo.entity.ServiceProvider;
import com.example.demo.entity.Users;
import com.example.demo.repo.addrRepo;
import com.example.demo.repo.serviceProviderRepo;
import com.example.demo.repo.userRepository;

@Service
public class userServiceImpl {

	@Autowired
	userRepository urepo;
	
	@Autowired
	serviceProviderRepo servrepo;
	
	@Autowired
	addrRepo addrrepoinf; 

	public Users checkUser( Users u) {
		System.out.println("from service "+u.getMailId()+u.getPassword()+u.getRole());
		System.out.println(urepo.findByMailIdAndPasswordAndRole(u.getMailId(), u.getPassword(), u.getRole()));
		return urepo.findByMailIdAndPasswordAndRole(u.getMailId(), u.getPassword(), u.getRole());
		
	}

	public @Valid Users regUser(@Valid Users u) {
		// TODO Auto-generated method stub
		return urepo.save(u);
	}

	public Optional<Users> getUserbyId(Users u) {
		return urepo.findById(u.getUserId());
	}

	public List<ServiceProvider> search(String keyword) {
		// TODO Auto-generated method stub
		return servrepo.search(keyword);
	}

	public Address registerAddress(Address addr) {
		// TODO Auto-generated method stub
		return addrrepoinf.save(addr);
	}

	
	
	
	
	
}
