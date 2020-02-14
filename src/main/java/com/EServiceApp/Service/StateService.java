package com.EServiceApp.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EServiceApp.entity.State;
import com.EServiceApp.repo.StateRepository;

@Service
public class StateService {

	@Autowired
	private StateRepository repo;

	public List<State> findAll()
	{
		return repo.findAll();
	}

	public State findById(long id) 
	{
		return repo.getOne(id);

	}
}
