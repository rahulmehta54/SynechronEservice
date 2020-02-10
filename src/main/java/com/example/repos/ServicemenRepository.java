package com.example.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Servicemen;

@Repository
public interface ServicemenRepository extends JpaRepository<Servicemen, Integer> {

}
