package com.eservice.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eservice.model.Category;
import com.eservice.model.InspectionRate;
import com.eservice.repository.InspectionRateRepo;

@Service
public class InspectionRateService {

	@Autowired
	private InspectionRateRepo repo;

	public List<InspectionRate> findByStatus(int status) {
		return repo.findByStatus(status);
	}

	public InspectionRate addInspectionRate(InspectionRate rate) {
		return repo.saveAndFlush(rate);
	}

	public InspectionRate findByName(String name, int status) {
		return repo.findByServiceNameAndStatus(name, status);
	}

	@Transactional
	public int deleteByStatus(int status, long id) {
		return repo.updateStatus(status, id);
	}

}
