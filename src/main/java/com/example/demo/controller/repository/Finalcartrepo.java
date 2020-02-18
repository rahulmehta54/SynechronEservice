package com.example.demo.controller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Finalcart;

public interface Finalcartrepo extends JpaRepository<Finalcart, Long> {

	void deleteBySalespersonid(Long check);

}
