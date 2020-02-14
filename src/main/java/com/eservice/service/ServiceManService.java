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
	private ServiceManRepo repo;

	public List<ServiceMan> findByStatus(int status) {
		return repo.findByStatus(status);
	}

	public ServiceMan addServiceMan(ServiceMan serviceMan) {
		return repo.saveAndFlush(serviceMan);
	}

	public ServiceMan findByEmailId(String emailId) {
		return repo.findByEmailId(emailId);
	}

	@Transactional
	public int updateStatus(int status, long id) {
		return repo.updateStatus(status, id);
	}

	public ServiceMan findById(long id) {
		return repo.getOne(id);
	}
	
	@Transactional
	public int updateBookingStatus(int status,long id)
	{
		return repo.updateBookingStatus(status, id);
	}
}
