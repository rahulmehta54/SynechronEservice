package com.eservice.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.eservice.model.ServiceMan;
import com.eservice.repository.ServiceManRepo;

@Service
public class ServiceManService {

	@Autowired
	private ServiceManRepo serviceManRepo;
	
	public ServiceMan addServiceMan(ServiceMan serviceMan) {
		return serviceManRepo.saveAndFlush(serviceMan);
	}
	
	public List<ServiceMan> findByStatus(int status){
		return serviceManRepo.findByStatus(status);
	}
	
	public ServiceMan findById(long id) {
		return serviceManRepo.getOne(id);		
	}
	
	@Transactional
	public int updateStatus(int status, long serviceId) {
		return serviceManRepo.updateStatus(status, serviceId);
	}
		
}