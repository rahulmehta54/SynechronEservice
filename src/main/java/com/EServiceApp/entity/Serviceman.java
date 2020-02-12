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
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Component
@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Serviceman {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long sid;

	@Column
	private String sName;

	@Column
	private Number sMobileNo;

	@Column
	private String sEmail;

	@Column
	@Value("0")
	private int bookingStatus;

	@OneToOne
	private Category sCategory;

	@OneToOne(cascade = CascadeType.ALL)
	private Address sAddress;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Serviceman_InspectionRate")
	private List<Inspection> inspectionRate;

	private int sExperience;

	private int sBookingStatus;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createDate")
	private Date createDate;

	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modifiedDate")
	private Date modifiedDate;

	
}
