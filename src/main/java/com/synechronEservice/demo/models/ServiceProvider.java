package com.synechronEservice.demo.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class ServiceProvider {

	@Id
	@GeneratedValue
    private int serviceId;
	private String firstName;
	private String lastName;
	private String city;
	private String category;
	private String mobileNo;
	private String rate;
	
	
	public int getServiceId() {
		return serviceId;
	}


	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}


	public String getRate() {
		return rate;
	}


	public void setRate(String rate) {
		this.rate = rate;
	}


	public List<UserServiceProviderBookingTracker> getUserserviceproviderlist() {
		return userserviceproviderlist;
	}


	public void setUserserviceproviderlist(List<UserServiceProviderBookingTracker> userserviceproviderlist) {
		this.userserviceproviderlist = userserviceproviderlist;
	}


	@OneToMany(targetEntity=UserServiceProviderBookingTracker.class,cascade=CascadeType.ALL)
	@JoinColumn(name="service_id",referencedColumnName="serviceId")
	private List<UserServiceProviderBookingTracker> userserviceproviderlist;
}
