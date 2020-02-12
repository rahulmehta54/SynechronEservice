package com.EServiceApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EServiceApp.entity.State;
@Repository
public interface StateRepository extends JpaRepository<State, Long> {

}
