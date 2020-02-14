package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Component
@AllArgsConstructor
@Entity
@Table(name = "serviceman_table")
public class Serviceman {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int service_Id;
	
	private String servicemanName;
	private String category;
	private long contact_No;
	private String city;
	private int exp;
	private int inspection_rate;
	private int payment_amount;
	private String payment_mode;
	
	public Serviceman() {
		super();
	}
}
