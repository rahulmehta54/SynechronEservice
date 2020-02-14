package com.example.demo.controller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.SalesPerson;

public interface SalesPersonRepository extends JpaRepository<SalesPerson, Long> {

	/*
	 * void updateSalesPerson(Long id, String category, String city, String
	 * experience, Double rate, Long mobileNumber, String salePersonName);
	 */
	 
	  
	
	 

	
	 

}
