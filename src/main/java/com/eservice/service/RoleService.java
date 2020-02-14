package com.eservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eservice.model.Role;
import com.eservice.repository.RoleRepo;

@Service
public class RoleService {

	@Autowired
	private RoleRepo repo;

	private Role findById(long id) {
		return repo.getOne(id);
	}

}
