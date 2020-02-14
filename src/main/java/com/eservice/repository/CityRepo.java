package com.eservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eservice.model.City;

public interface CityRepo extends JpaRepository<City, Long>{

}
