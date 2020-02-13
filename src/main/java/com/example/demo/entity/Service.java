package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="servicemen")
public class Service {

	@Id
	private int service_id;
	private String Sfname;
	private String Slname;
	private String category; 
	private long mob;
	private String city;
	private int exp;
	private int insp_rate;
	private double pay_amt;
	private String pay_mode;
}
