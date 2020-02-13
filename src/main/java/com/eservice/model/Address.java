package com.eservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Entity
@Table(name="tbl_address")
@Component
public class Address {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String addressLine1;
	
	private String addressLine2;
	
	@OneToOne
	private City city;
	
	@OneToOne
	private State state;
	
	
	
}
