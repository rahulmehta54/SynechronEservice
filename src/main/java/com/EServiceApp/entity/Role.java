package com.EServiceApp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Role {

	@Id
	private long r_id;
	
	@Column
	private String r_name;
	
	@Column
	private int accessLevel;
	
	
	
	
}
