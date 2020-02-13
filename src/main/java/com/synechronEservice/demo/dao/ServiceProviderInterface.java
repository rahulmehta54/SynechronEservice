package com.synechronEservice.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.synechronEservice.demo.models.ServiceProvider;

@Repository
public interface ServiceProviderInterface extends JpaRepository<ServiceProvider, Integer>{

	List<ServiceProvider> findByCityAndCategory(String city, String category);
}
