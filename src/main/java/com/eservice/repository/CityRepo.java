package com.eservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eservice.model.City;
@Repository
public interface CityRepo extends JpaRepository<City, Long>{

}
