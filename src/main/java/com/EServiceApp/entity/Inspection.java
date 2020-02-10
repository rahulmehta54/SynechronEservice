package com.EServiceApp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Inspection {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)

	private long service_id;
	
	@Column 
	private String service_name;
	
	@Column
	private String s_charges;
	
	@Column
	private String status;
	
}
