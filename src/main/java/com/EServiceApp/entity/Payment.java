package com.EServiceApp.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Table
public class Payment {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long p_id;
	
	@Column
	private String p_modeOfPayment;
	
	@Column
	private double p_amount;
	
	@Column
	private String p_description;
	
	@Temporal(TemporalType.DATE)
	private Date p_payDate;
	
	
	@OneToOne
	private User user;
	
	@OneToOne
	private Serviceman serviceman;
	
	@OneToOne
	private Inspection inspectionRate;
	
	
}
