package com.eservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eservice.model.Cart;

public interface CartRepo extends JpaRepository<Cart, Long>{

}
