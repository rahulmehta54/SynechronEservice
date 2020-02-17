package com.example.demo.Service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ServiceProvider;
import com.example.demo.repo.ServiceProvider_Repo;

@Service
public class ServiceProvider_ServiceImpl {

	@Autowired
	ServiceProvider_Repo servRepo;
	
	public List<ServiceProvider> getAllServiceProvider()
	{
		return servRepo.findAll();
	}
	
	public List<ServiceProvider> search(String keyword)
	{
		return servRepo.search(keyword);
	}
	public ServiceProvider getServiceProviderByID(int sid)
	{ 
		return servRepo.findByserviceId(sid); 
	}
	
	public ServiceProvider addService(@Valid ServiceProvider sp)
	{
		return servRepo.save(sp);
	}
	
	public List<ServiceProvider> viewService()
	{
		return servRepo.findAll();
	}
	
	
}
