package com.eservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long c_id;
	
	@OneToOne
	private User c_user;
	
	@OneToOne
	private ServiceMan c_serviceMan;
	
	@OneToOne
	private InspectionCharge c_charges;
	
	private int c_status;
}
