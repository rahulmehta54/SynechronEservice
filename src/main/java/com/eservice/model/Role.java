package com.eservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="tbl_role")
public class Role {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String roleName;
	
	private int accessLevel;
	
}
