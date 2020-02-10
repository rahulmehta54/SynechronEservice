package com.EServiceApp.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Value;

@Entity
@Table
public class Serviceman {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long s_id;
	
	@Column
	private String s_name;
	
	@Column
	private Number s_mobileNo;
	
	@Column
	private String s_email;
	
	@Column
	@Value("0")
	private int booking_status;
	
	@OneToOne
	private Category s_category;
	
	@OneToOne 
	private Address s_address;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Serviceman_InspectionRate")
	private List<Inspection> inspection_rate;
	
	private int s_experience;

	private int s_bookingStatus;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "s_createDate")
	private Date s_createDate;

	
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "s_modifiedDate")
	private Date s_modifiedDate;


	

}
