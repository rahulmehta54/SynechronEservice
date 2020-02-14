package com.EServiceApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EServiceApp.entity.City;
import com.EServiceApp.repo.CityRepository;

@Service
public class CityService {

	@Autowired
	private CityRepository repo;
	
	public List<City> findAll()
	{
		return repo.findAll();
	}
	
	public City findById(long id) 
	{
		return repo.getOne(id);
	}
}
