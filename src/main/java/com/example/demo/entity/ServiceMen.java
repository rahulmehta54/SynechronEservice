package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "servicemen")
public class ServiceMen {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int serviceId;
	public String sFName;
	private String sLName;
	private String category;
	private String mob;
	private String city;
	private int experience;
	private int inspectionRate;
	private double payAmount;
	private String payMode;
	private int status;
	
	
	public int getServiceId() {
		return serviceId;
	}
	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}
	public String getsFName() {
		return sFName;
	}
	public void setsFName(String sFName) {
		this.sFName = sFName;
	}
	public String getsLName() {
		return sLName;
	}
	public void setsLName(String sLName) {
		this.sLName = sLName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public int getInspectionRate() {
		return inspectionRate;
	}
	public void setInspectionRate(int inspectionRate) {
		this.inspectionRate = inspectionRate;
	}
	public double getPayAmount() {
		return payAmount;
	}
	public void setPayAmount(double payAmount) {
		this.payAmount = payAmount;
	}
	public String getPayMode() {
		return payMode;
	}
	public void setPayMode(String payMode) {
		this.payMode = payMode;
	}
	@Override
	public String toString() {
		return "ServiceMen [serviceId=" + serviceId + ", sFName=" + sFName + ", sLName=" + sLName + ", category="
				+ category + ", mob=" + mob + ", city=" + city + ", experience=" + experience + ", inspectionRate="
				+ inspectionRate + ", payAmount=" + payAmount + ", payMode=" + payMode + "]";
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
	
}
