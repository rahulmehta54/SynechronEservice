package com.example.demo.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_order")
public class Order implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;
	
	private String sMenFName;
	private String sMenLName;
	private String mobile;
	private String city;
	private String experience;
	private String inspectionRates;
	private String payAmount;
	private String paymentMode;
	private int userId;
	private int sId;

	public Order() {
	}

	public Order(int orderId, String sMenFName, String sMenLName, String mobile, String city, String experience,
			String inspectionRates, String payAmount, String paymentMode, int userId, int sId) {
		super();
		this.orderId = orderId;
		this.sMenFName = sMenFName;
		this.sMenLName = sMenLName;
		this.mobile = mobile;
		this.city = city;
		this.experience = experience;
		this.inspectionRates = inspectionRates;
		this.payAmount = payAmount;
		this.paymentMode = paymentMode;
		this.userId = userId;
		this.sId = sId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getsMenFName() {
		return sMenFName;
	}

	public void setsMenFName(String sMenFName) {
		this.sMenFName = sMenFName;
	}

	public String getsMenLName() {
		return sMenLName;
	}

	public void setsMenLName(String sMenLName) {
		this.sMenLName = sMenLName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getInspectionRates() {
		return inspectionRates;
	}

	public void setInspectionRates(String inspectionRates) {
		this.inspectionRates = inspectionRates;
	}

	public String getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

}