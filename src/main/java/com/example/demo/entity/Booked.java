package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Booked")
public class Booked {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long bookedId;
	private long serviceId;
	private long userId;
		
	public Booked() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Booked(long bookedId, long serviceId, long userId) {
		super();
		this.bookedId = bookedId;
		this.serviceId = serviceId;
		this.userId = userId;
	}

	public long getBookedId() {
		return bookedId;
	}

	public void setBookedId(long bookedId) {
		this.bookedId = bookedId;
	}

	public long getServiceId() {
		return serviceId;
	}

	public void setServiceId(long serviceId) {
		this.serviceId = serviceId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Booked [bookedId=" + bookedId + ", serviceId=" + serviceId + ", userId=" + userId + "]";
	}
	
	

}
