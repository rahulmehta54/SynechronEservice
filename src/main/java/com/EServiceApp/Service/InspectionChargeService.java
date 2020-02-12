package com.EServiceApp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EServiceApp.entity.Inspection;
import com.EServiceApp.repo.InspectionRepository;

@Service
public class InspectionChargeService {

	@Autowired
	private InspectionRepository repo;
	
	public Inspection addinspectionCharge(Inspection inspection) {
		
		return repo.saveAndFlush(inspection);
		
		
	}

	
}
