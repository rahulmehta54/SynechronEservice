package com.eservice.model;

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
import javax.validation.Valid;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Entity
@Table(name = "tbl_serviceMan")
@Component
public class ServiceMan {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String name;

	private long mobileNumber;

	private String emailId;

	private int status;

	@OneToOne
	private Category category;

	@OneToOne
	private Address address;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "serviceman_inspectionrate")
	private List<InspectionRate> inspectionRate;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_date")
	private Date createDate;

	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modify_date")
	private Date modifyDate;

	@Value("0")
	private int bookingStatus;

	private int experience;

	private double rate;

}
