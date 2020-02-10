package com.EServiceApp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Category {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long Cid;
	@Column
	private String C_Name;
	@Column
	private int C_Status;
	
	
	
}
