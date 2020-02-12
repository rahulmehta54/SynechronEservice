package com.EServiceApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EServiceApp.entity.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {

}
