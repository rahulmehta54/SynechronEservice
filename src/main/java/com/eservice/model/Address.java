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
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long a_id;
	private String addressLine1;
	private String addressLine2;
	
	@OneToOne
	private City city;
	
	@OneToOne
	private State state;
	
}
