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
	Long id;
	@Column(name="salePersonName")
	String salePersonName;
	@Column(name="category")
	String category;
	@Column(name="mobileNumber")
	Long mobileNumber;
	@Column(name="city")
	String city;
	@Column(name="experience")
	String experience;
	@Column(name="rate")
	Double rate;
	
}
