package com.eservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eservice.model.Address;

public interface AddressRepo extends JpaRepository<Address, Long>{

	
}
