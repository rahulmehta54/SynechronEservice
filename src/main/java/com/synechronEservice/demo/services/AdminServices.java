package com.synechronEservice.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.synechronEservice.demo.dao.ServiceProviderInterface;
import com.synechronEservice.demo.models.ServiceProvider;

@Service
public class AdminServices {
	@Autowired
	ServiceProviderInterface srvcprointr;
	
	@Autowired
	ServiceProvider serviceProvider;
	
	public ServiceProvider getProviderDetailUsingId(int id){
       Optional<ServiceProvider> servcProvide=srvcprointr.findById(id);
       serviceProvider=servcProvide.get();
	   return serviceProvider;
    }
}
