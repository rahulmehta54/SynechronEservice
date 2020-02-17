package com.example.demo.controller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.FinalOrder;

public interface FinalOrderRepo extends JpaRepository<FinalOrder,Long> {



}
