package com.eservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eservice.model.Address;
import com.eservice.repository.AddressRepo;

@Service
public class AddressService {
	
	@Autowired
	private AddressRepo addressRepo;

	public Address saveAddress(Address address) {
		return addressRepo.saveAndFlush(address);
		
	}
}
