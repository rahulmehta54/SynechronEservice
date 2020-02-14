package com.example.demo.entity;

import java.util.Date;

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
@Table(name="OrderP")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
	/*
	 * @Id
	 * 
	 * @GeneratedValue(strategy = GenerationType.AUTO)
	 * 
	 * @Column(name = "id") Long id;
	 * 
	 * @Column(name = "customerId") Long customerId;
	 * 
	 * @Column(name = "date") String date;
	 * 
	 * @Column(name="sum") Long sum;
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	Long id;
	@Column(name = "customerId")
	Long customerId;
	@Column(name = "date")
	Date date;
	@Column(name = "sum")
	String sum;
	
	
	
	
	
}
