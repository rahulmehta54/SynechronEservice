package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ServiceMen;

@Repository
public interface ServiceMenRepository extends JpaRepository<ServiceMen, Integer>{

}
