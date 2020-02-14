package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Serviceman;

@Repository
public interface ServicemanRepository extends JpaRepository<Serviceman, Integer> {

}
