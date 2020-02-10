package com.eservice.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long p_id;
	private String p_paymentDiscription;
	private String p_modeOfPayment;
	private double p_amount;
	
	@Temporal(TemporalType.DATE)
	private Date p_payDate;
	
	@OneToOne
	private User p_user;
	
	@OneToOne
	private ServiceMan p_serviceMan;
	
	@OneToOne
	private InspectionCharge p_inspectionCharge;

}
