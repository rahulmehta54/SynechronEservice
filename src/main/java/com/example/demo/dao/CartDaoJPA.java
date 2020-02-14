package com.example.demo.dao;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.Cart;

@Repository
public interface CartDaoJPA extends JpaRepositoryImplementation<Cart, Integer> {

}
