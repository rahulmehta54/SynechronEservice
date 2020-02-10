package com.example.demo.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "UserInfo")
public class UserInfo {
	
	@Id
	private long userId;
	private String userName;
	private String address;
	private String city;
	private long phoneNumber;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "serviceProvider_ref")	// primary column of client table
	private Set<ServiceProviderInfo> serviceProviderList =  new HashSet<>();
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "user_ref")
	private Set<UserServiceProviderRelation> userRef =  new HashSet<>();

	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserInfo(long userId, String userName, String address, String city, long phoneNumber,
			Set<ServiceProviderInfo> serviceProviderList, Set<UserServiceProviderRelation> userRef) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.address = address;
		this.city = city;
		this.phoneNumber = phoneNumber;
		this.serviceProviderList = serviceProviderList;
		this.userRef = userRef;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Set<ServiceProviderInfo> getServiceProviderList() {
		return serviceProviderList;
	}

	public void setServiceProviderList(Set<ServiceProviderInfo> serviceProviderList) {
		this.serviceProviderList = serviceProviderList;
	}

	public Set<UserServiceProviderRelation> getUserRef() {
		return userRef;
	}

	public void setUserRef(Set<UserServiceProviderRelation> userRef) {
		this.userRef = userRef;
	}

	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", userName=" + userName + ", address=" + address + ", city=" + city
				+ ", phoneNumber=" + phoneNumber + ", serviceProviderList=" + serviceProviderList + ", userRef="
				+ userRef + "]";
	}

	
}
