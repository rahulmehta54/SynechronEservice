package com.eservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eservice.model.Role;

public interface RoleRepo extends JpaRepository<Role, Long>{

}
