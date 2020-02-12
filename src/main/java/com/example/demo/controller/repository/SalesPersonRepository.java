package com.example.demo.controller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.SalesPerson;

public interface SalesPersonRepository extends JpaRepository<SalesPerson, Integer> {

}
