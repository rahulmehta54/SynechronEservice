package com.eservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eservice.model.InspectionCharge;

public interface InspectionChargeRepo extends JpaRepository<InspectionCharge, Long>{

	public List<InspectionCharge> findByStatus(int status);
}
