package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.dto.ServiceMen;

@Repository
public interface ServiceMenDao {
	
	int editServiceMen(ServiceMen serviceMen);

	List<ServiceMen> filteredServiceMens(ServiceMen serviceMen);
}
