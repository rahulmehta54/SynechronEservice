package com.eservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eservice.model.Payment;
import com.eservice.repository.PaymentRepo;

@Service
public class PaymentService {

	@Autowired
	private PaymentRepo repo;

	public List<Payment> findAll() {
		return repo.findAll();
	}

	public Payment addPayment(Payment pay) {
		return repo.saveAndFlush(pay);
	}

	public List<Payment> findByUser(long userId) {
		return repo.findByUserId(userId);
	}
}
