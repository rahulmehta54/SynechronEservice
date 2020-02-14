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
	private long sMobileNo;

	@Column
	private String sEmail;

	@Column
	@Value("0")
	private int sBookingStatus;

	@OneToOne
	private Category sCategory;

	@OneToOne(cascade = CascadeType.ALL)
	private Address sAddress;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Serviceman_InspectionRate")
	private List<Inspection> inspectionRate;

	private int sExperience;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createDate")
	private Date createDate;

	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modifiedDate")
	private Date modifiedDate;

	@Value("1")
	private int status;

	private double inspectioncharge;

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public long getsMobileNo() {
		return sMobileNo;
	}

	public void setsMobileNo(long sMobileNo) {
		this.sMobileNo = sMobileNo;
	}

	public String getsEmail() {
		return sEmail;
	}

	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}

	public int getsBookingStatus() {
		return sBookingStatus;
	}

	public void setsBookingStatus(int sBookingStatus) {
		this.sBookingStatus = sBookingStatus;
	}

	public Category getsCategory() {
		return sCategory;
	}

	public void setsCategory(Category sCategory) {
		this.sCategory = sCategory;
	}

	public Address getsAddress() {
		return sAddress;
	}

	public void setsAddress(Address sAddress) {
		this.sAddress = sAddress;
	}

	public int getsExperience() {
		return sExperience;
	}

	public void setsExperience(int sExperience) {
		this.sExperience = sExperience;
	}
	
	
	

}
