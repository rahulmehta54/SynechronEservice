package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UserServiceProviderRelation")
public class UserServiceProviderRelation {
	
	@Id
	private long id;
	private String category;
	private String date;
	private double amount;
	
	public UserServiceProviderRelation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserServiceProviderRelation(String category, String date, double amount) {
		super();
		this.category = category;
		this.date = date;
		this.amount = amount;
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

	@Override
	public String toString() {
		return "UserServiceProviderRelation [category=" + category + ", date=" + date + ", amount=" + amount + "]";
	}

	
}
