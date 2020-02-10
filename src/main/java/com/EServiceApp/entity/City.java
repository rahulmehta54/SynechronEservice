package com.EServiceApp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table
public class City {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)

	private int c_id;

	@Column
	private String c_name;
	 
	@OneToOne
	private State state;
}
