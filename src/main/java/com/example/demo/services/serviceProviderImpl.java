package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ServiceProvider;
import com.example.demo.repo.serviceProviderRepo;

@Service
public class serviceProviderImpl {
	
	@Autowired
	serviceProviderRepo sprepo;
	
	public ServiceProvider addService(@Valid ServiceProvider sp)
	{
		return sprepo.save(sp);
	}
	
	public List<ServiceProvider> viewService()
	{
		return sprepo.findAll();
	}

	public Optional<ServiceProvider> getServbyId(int sid) {
		// TODO Auto-generated method stub
		return sprepo.findById(sid);
	}

	public ServiceProvider updateService(ServiceProvider srvp) {
		
		return sprepo.save(srvp);
	}

	public void deleteService(int sid) {
		
		sprepo.deleteById(sid);
		
	}

}
