package com.example.demo.daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ServiceProviderInfo;
import com.example.demo.repos.ServiceProviderRepository;

@Repository
public class ServiceProviderDao {

	@Autowired
	private ServiceProviderRepository repo;
	
	public List<ServiceProviderInfo> listAll() {
        return (List<ServiceProviderInfo>) repo.findAll();
    }
	
	public ServiceProviderInfo get(long serviceId) {
		System.out.println("id : "+serviceId);
        return repo.findById(serviceId).get();
    }

	public void delete(long id) {
		System.out.println("inside delete call");
		  repo.deleteById(id);;
	}
}
