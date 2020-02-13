package com.example.demo.repos;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ServiceProviderInfo;

@Repository
public interface ServiceProviderRepository extends JpaRepository<ServiceProviderInfo, Long> {

	List<ServiceProviderInfo> findByCategory(String category);
	
	@Query("SELECT DISTINCT c.city FROM ServiceProviderInfo c ")
	List<String> findAllCities();

	List<ServiceProviderInfo> findByCity(String city);

}
