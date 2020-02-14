package com.example.demo.dao;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.Order;

@Repository
public interface OrderDaoJPA extends JpaRepositoryImplementation<Order, Integer> {

}
