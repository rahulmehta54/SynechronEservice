package com.EServiceApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EServiceApp.entity.Address;
import com.EServiceApp.repo.AddressRepository;


@Service
public class AddressService {

	@Autowired
	private AddressRepository repo;
	
	public List<Address> findAll()
	{
		return repo.findAll();
	}
	
	public Address saveAddress(Address address) 
	{
		return repo.saveAndFlush(address);
	}

}
