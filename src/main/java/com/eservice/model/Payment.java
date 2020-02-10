package com.eservice.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name="tbl_payment")
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String paymentDescription;

	private String modeOfPayment;

	private double amount;

	@Temporal(TemporalType.DATE)
	private Date paymentDate;

	@OneToOne
	private User user;

	@OneToOne
	private ServiceMan serviceMan;

	@OneToOne
	private InspectionRate rate;

}
