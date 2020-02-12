package com.synechronEservice.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.synechronEservice.demo.models.Users;

@Repository
public interface LoginInterface extends JpaRepository<Users, Integer> {

	
}
