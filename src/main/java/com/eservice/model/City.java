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
public class City {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int c_id;
	private String c_name;
	
	@OneToOne
	private State c_state;
}
