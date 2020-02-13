package com.eservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eservice.model.State;
import com.eservice.repository.StateRepo;

@Service
public class StateService {

	@Autowired
	private StateRepo repo;

	public List<State> findAll() {
		return repo.findAll();
	}

	public State findbyId(long id) {
		return repo.getOne(id);
	}
}
