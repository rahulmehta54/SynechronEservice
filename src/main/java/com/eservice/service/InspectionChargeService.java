package com.eservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eservice.model.InspectionCharge;
import com.eservice.repository.InspectionChargeRepo;

@Service
public class InspectionChargeService {

	@Autowired
	private InspectionChargeRepo inspectionChargeRepo;
	
	public List<InspectionCharge> findByStatus(int status) {
		return inspectionChargeRepo.findByStatus(status);
		
	}

	public InspectionCharge addInspectionCharge(InspectionCharge inspectionCharges) {
		return inspectionChargeRepo.saveAndFlush(inspectionCharges);
		
	}
}
