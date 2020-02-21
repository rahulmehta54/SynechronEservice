package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="cart")
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cartId;
	private int serviceId;
	private String servicemenName;
	private int contact;
	private String category;
	private int userId;
	private String city;
	private int inspectionRate;
	private String mob;
	
	
	//to map cart and servicemen by using serviceid
	@OneToOne
	public ServiceMen service;
	
	
	@OneToOne
	public User user;
}
