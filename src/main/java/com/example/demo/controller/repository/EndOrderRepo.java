package com.example.demo.controller.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.EndOrder;

public interface EndOrderRepo extends JpaRepository<EndOrder, Long> {


List<EndOrder> findAllByCustomerId(Long id);

}
