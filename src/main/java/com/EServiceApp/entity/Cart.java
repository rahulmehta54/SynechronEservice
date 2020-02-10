package com.EServiceApp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Cart {

	@Id
	private int cart_id;
	
	@OneToOne
	private User user;

	@OneToOne
	private Serviceman s_man;
	
	@OneToOne
	private Inspection charge;
	
	private int status;
}
