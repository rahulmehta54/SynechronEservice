package com.eservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eservice.model.City;
import com.eservice.repository.CityRepo;

@Service
public class CityService {
	
	@Autowired
	private CityRepo cityRepo;

	public List<City> findAll() {
		return cityRepo.findAll();
	}
	
	public City findById(long id) {
		return cityRepo.getOne(id);
	}

}
