package com.synechronEservice.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.synechronEservice.demo.models.ServiceProvider;

@Repository
public interface ServiceProviderInterface extends JpaRepository<ServiceProvider, Integer>{

}
