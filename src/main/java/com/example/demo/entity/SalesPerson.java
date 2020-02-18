package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="salesperson")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalesPerson {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	@Column(name="salePersonName")
	private String salePersonName;
	@Column(name="category")
	private String category;
	@Column(name="mobileNumber")
	private Long mobileNumber;
	@Column(name="city")
	private String city;
	@Column(name="experience")
	private String experience;
	@Column(name="rate")
	private Double rate;
	
}
