package com.eservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eservice.model.Payment;

public interface PaymentRepo extends JpaRepository<Payment, Long>{

}
