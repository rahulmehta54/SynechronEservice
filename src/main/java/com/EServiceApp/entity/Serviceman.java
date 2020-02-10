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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

	@OneToOne(cascade = CascadeType.ALL)
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

	public long getS_id() {
		return s_id;
	}

	public void setS_id(long s_id) {
		this.s_id = s_id;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public Number getS_mobileNo() {
		return s_mobileNo;
	}

	public void setS_mobileNo(Number s_mobileNo) {
		this.s_mobileNo = s_mobileNo;
	}

	public String getS_email() {
		return s_email;
	}

	public void setS_email(String s_email) {
		this.s_email = s_email;
	}

	public int getBooking_status() {
		return booking_status;
	}

	public void setBooking_status(int booking_status) {
		this.booking_status = booking_status;
	}

	public Category getS_category() {
		return s_category;
	}

	public void setS_category(Category s_category) {
		this.s_category = s_category;
	}

	public Address getS_address() {
		return s_address;
	}

	public void setS_address(Address s_address) {
		this.s_address = s_address;
	}

	public List<Inspection> getInspection_rate() {
		return inspection_rate;
	}

	public void setInspection_rate(List<Inspection> inspection_rate) {
		this.inspection_rate = inspection_rate;
	}

	public int getS_experience() {
		return s_experience;
	}

	public void setS_experience(int s_experience) {
		this.s_experience = s_experience;
	}

	public int getS_bookingStatus() {
		return s_bookingStatus;
	}

	public void setS_bookingStatus(int s_bookingStatus) {
		this.s_bookingStatus = s_bookingStatus;
	}

	public Date getS_createDate() {
		return s_createDate;
	}

	public void setS_createDate(Date s_createDate) {
		this.s_createDate = s_createDate;
	}

	public Date getS_modifiedDate() {
		return s_modifiedDate;
	}

	public void setS_modifiedDate(Date s_modifiedDate) {
		this.s_modifiedDate = s_modifiedDate;
	}

	public Serviceman() {
		super();
	}

	public Serviceman(long s_id, String s_name, Number s_mobileNo, String s_email, int booking_status,
			Category s_category, Address s_address, List<Inspection> inspection_rate, int s_experience,
			int s_bookingStatus, Date s_createDate, Date s_modifiedDate) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.s_mobileNo = s_mobileNo;
		this.s_email = s_email;
		this.booking_status = booking_status;
		this.s_category = s_category;
		this.s_address = s_address;
		this.inspection_rate = inspection_rate;
		this.s_experience = s_experience;
		this.s_bookingStatus = s_bookingStatus;
		this.s_createDate = s_createDate;
		this.s_modifiedDate = s_modifiedDate;
	}

	@Override
	public String toString() {
		return "Serviceman [s_id=" + s_id + ", s_name=" + s_name + ", s_mobileNo=" + s_mobileNo + ", s_email=" + s_email
				+ ", booking_status=" + booking_status + ", s_category=" + s_category + ", s_address=" + s_address
				+ ", inspection_rate=" + inspection_rate + ", s_experience=" + s_experience + ", s_bookingStatus="
				+ s_bookingStatus + ", s_createDate=" + s_createDate + ", s_modifiedDate=" + s_modifiedDate + "]";
	}

}
