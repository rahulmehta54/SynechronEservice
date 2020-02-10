package com.eservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class InspectionCharge {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long i_id;
	private String i_serviceName;
	private long i_minCharges;
	private int i_status;
}
