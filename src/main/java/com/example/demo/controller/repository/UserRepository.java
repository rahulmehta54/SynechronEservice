package com.example.demo.controller.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {


	
	//  @Query("SELECT u FROM user u where u.email = ?1 AND u.password = ?2 AND u.role= ?3")
	List<User> findByEmailAndPasswordAndRole(String email, String password, String role);

	

}
