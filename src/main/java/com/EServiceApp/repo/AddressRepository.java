package com.EServiceApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EServiceApp.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{
	

}
