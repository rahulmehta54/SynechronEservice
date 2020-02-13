package com.synechronEservice.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.synechronEservice.demo.dao.ServiceProviderInterface;
import com.synechronEservice.demo.dao.ServiceProviderJdbcImpl;
import com.synechronEservice.demo.models.ServiceProvider;

@Service
public class UserService {
	
	@Autowired
	
	ServiceProviderInterface srvInterF;

	public List<ServiceProvider> getDetailsOnTheBasis(String service, String location) {
		// TODO Auto-generated method stub
		return srvInterF.findByCityAndCategory(location, service);
	}

	
}
