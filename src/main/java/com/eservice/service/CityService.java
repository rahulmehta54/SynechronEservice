package com.eservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eservice.model.City;
import com.eservice.repository.CityRepo;

@Service
public class CityService {

	@Autowired
	private CityRepo repo;

	public List<City> findAll() {
		return repo.findAll();
	}
	
	public City findbyId(long id)
	{
		return repo.getOne(id);
	}

}
