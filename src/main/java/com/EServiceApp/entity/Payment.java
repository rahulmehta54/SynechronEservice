package com.EServiceApp.entity;

import java.util.Date;

import javax.persistence.CascadeType;
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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long p_id;

	@Column
	private String p_modeOfPayment;

	@Column
	private double p_amount;

	@Column
	private String p_description;

	@Temporal(TemporalType.DATE)
	private Date p_payDate;

	@OneToOne(cascade = CascadeType.ALL)
	private User user;

	@OneToOne(cascade = CascadeType.ALL)
	private Serviceman serviceman;

	@OneToOne(cascade = CascadeType.ALL)
	private Inspection inspectionRate;

	public long getP_id() {
		return p_id;
	}

	public void setP_id(long p_id) {
		this.p_id = p_id;
	}

	public String getP_modeOfPayment() {
		return p_modeOfPayment;
	}

	public void setP_modeOfPayment(String p_modeOfPayment) {
		this.p_modeOfPayment = p_modeOfPayment;
	}

	public double getP_amount() {
		return p_amount;
	}

	public void setP_amount(double p_amount) {
		this.p_amount = p_amount;
	}

	public String getP_description() {
		return p_description;
	}

	public void setP_description(String p_description) {
		this.p_description = p_description;
	}

	public Date getP_payDate() {
		return p_payDate;
	}

	public void setP_payDate(Date p_payDate) {
		this.p_payDate = p_payDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Serviceman getServiceman() {
		return serviceman;
	}

	public void setServiceman(Serviceman serviceman) {
		this.serviceman = serviceman;
	}

	public Inspection getInspectionRate() {
		return inspectionRate;
	}

	public void setInspectionRate(Inspection inspectionRate) {
		this.inspectionRate = inspectionRate;
	}

	public Payment() {
		super();
	}

	public Payment(long p_id, String p_modeOfPayment, double p_amount, String p_description, Date p_payDate, User user,
			Serviceman serviceman, Inspection inspectionRate) {
		super();
		this.p_id = p_id;
		this.p_modeOfPayment = p_modeOfPayment;
		this.p_amount = p_amount;
		this.p_description = p_description;
		this.p_payDate = p_payDate;
		this.user = user;
		this.serviceman = serviceman;
		this.inspectionRate = inspectionRate;
	}

	@Override
	public String toString() {
		return "Payment [p_id=" + p_id + ", p_modeOfPayment=" + p_modeOfPayment + ", p_amount=" + p_amount
				+ ", p_description=" + p_description + ", p_payDate=" + p_payDate + ", user=" + user + ", serviceman="
				+ serviceman + ", inspectionRate=" + inspectionRate + "]";
	}

}
