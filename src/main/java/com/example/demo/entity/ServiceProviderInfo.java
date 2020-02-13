package com.example.demo.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ServiceProviderInfo")
public class ServiceProviderInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "serviceId")
	private long serviceId;
	private String category;
	private String providerName;
	private long mobileNumber;
	private String city;
	private long experience;
	private double inspectionRate;
	
	@ManyToOne
	private Cart cart;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "serviceId")
	private Set<UserServiceProviderRelation> serviceRef =  new HashSet<>();
	
	
	public ServiceProviderInfo() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ServiceProviderInfo(long serviceId, String category, String providerName, long mobileNumber, String city,
			long experience, double inspectionRate, Set<UserServiceProviderRelation> serviceRef) {
		super();
		this.serviceId = serviceId;
		this.category = category;
		this.providerName = providerName;
		this.mobileNumber = mobileNumber;
		this.city = city;
		this.experience = experience;
		this.inspectionRate = inspectionRate;
		this.serviceRef = serviceRef;
	}


	public long getServiceId() {
		return serviceId;
	}


	public void setServiceId(long serviceId) {
		this.serviceId = serviceId;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getProviderName() {
		return providerName;
	}


	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}


	public long getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public long getExperience() {
		return experience;
	}


	public void setExperience(long experience) {
		this.experience = experience;
	}


	public double getInspectionRate() {
		return inspectionRate;
	}


	public void setInspectionRate(double inspectionRate) {
		this.inspectionRate = inspectionRate;
	}


	public Set<UserServiceProviderRelation> getServiceRef() {
		return serviceRef;
	}


	public void setServiceRef(Set<UserServiceProviderRelation> serviceRef) {
		this.serviceRef = serviceRef;
	}


	@Override
	public String toString() {
		return "ServiceProviderInfo [serviceId=" + serviceId + ", category=" + category + ", providerName="
				+ providerName + ", mobileNumber=" + mobileNumber + ", city=" + city + ", experience=" + experience
				+ ", inspectionRate=" + inspectionRate + ", serviceRef=" + serviceRef + "]";
	}
	
}
