package com.eservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.eservice.model.Payment;

@Repository
public interface PaymentRepo extends JpaRepository<Payment, Long> {

	@Query("select e from Payment e inner join e.user u where u.id=:userId")
	List<Payment> findByUserId(@Param("userId") long userId);

}
