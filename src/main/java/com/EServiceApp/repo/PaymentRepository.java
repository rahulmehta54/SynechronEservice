package com.EServiceApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EServiceApp.entity.Payment;
@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
