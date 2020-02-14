package com.eservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eservice.model.Order;

public interface OrderRepo extends JpaRepository<Order, Long>{

}
