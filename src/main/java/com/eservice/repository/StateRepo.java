package com.eservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eservice.model.State;

public interface StateRepo extends JpaRepository<State, Long>{

}
