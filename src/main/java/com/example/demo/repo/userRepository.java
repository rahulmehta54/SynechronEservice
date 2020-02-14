package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ServiceProvider;
import com.example.demo.entity.Users;

@Repository
public interface userRepository extends JpaRepository<Users, Integer> {

	Users findByMailIdAndPasswordAndRole(String mailId, String password, String role);

	
	
	

}
