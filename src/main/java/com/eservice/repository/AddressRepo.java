package com.eservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eservice.model.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address, Long> {

}
