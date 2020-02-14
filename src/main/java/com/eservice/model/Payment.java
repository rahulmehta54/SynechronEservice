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
	private long paymentId;
	private String paymentDiscription;
	private String modeOfPayment;
	private double amount;
	
	@Temporal(TemporalType.DATE)
	private Date payDate;
	
	@OneToOne
	private User user;
	
	@OneToOne
	private ServiceMan serviceMan;
	
	@OneToOne
	private InspectionCharge inspectionCharge;
	
	@OneToOne
	private Cart cart;

}
