package com.eservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eservice.model.City;
import com.eservice.model.State;
import com.eservice.repository.StateRepo;

@Service 
public class StateService {
	
	@Autowired
	private StateRepo stateRepo;
	
	public List<State> findAll() {
		return stateRepo.findAll();
	}
	
	public State findById(long id) {
		return stateRepo.getOne(id);
	}

}
