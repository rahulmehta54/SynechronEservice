package com.eservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Entity
@Table(name="tbl_inspectionRate")
@Component
public class InspectionRate {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String serviceName;

	private double rate;

	private int status;

}
