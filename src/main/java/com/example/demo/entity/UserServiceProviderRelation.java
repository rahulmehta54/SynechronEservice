package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UserServiceProviderRelation")
public class UserServiceProviderRelation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String category;
	private String date;
	private double amount;
	private double userId_ref;
	
	public UserServiceProviderRelation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserServiceProviderRelation(long id, String category, String date, double amount, double userId_ref) {
		super();
		this.id = id;
		this.category = category;
		this.date = date;
		this.amount = amount;
		this.userId_ref = userId_ref;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getUserId_ref() {
		return userId_ref;
	}

	public void setUserId_ref(double userId_ref) {
		this.userId_ref = userId_ref;
	}

	@Override
	public String toString() {
		return "UserServiceProviderRelation [id=" + id + ", category=" + category + ", date=" + date + ", amount="
				+ amount + ", userId_ref=" + userId_ref + "]";
	}

	

	

	
}
