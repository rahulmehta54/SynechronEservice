package com.eservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eservice.model.State;
@Repository
public interface StateRepo extends JpaRepository<State, Long> {

}
