package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "servicemen")
@Data

public class ServiceMen {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String occupation;
	private String city;
	private String mobileNo;
	private String serviceCharges;
	
	public ServiceMen() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public ServiceMen(int id, String name, String occupation, String city, String mobileNo, String serviceCharges) {
		super();
		this.id = id;
		this.name = name;
		this.occupation = occupation;
		this.city = city;
		this.mobileNo = mobileNo;
		this.serviceCharges = serviceCharges;
	}
	
	
	
}
