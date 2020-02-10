package com.EServiceApp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int a_id;

	@Column
	private String addLine1;

	@Column
	private String addLine2;

	@OneToOne
	private City city;

	@OneToOne
	private State state;

	public int getA_id() {
		return a_id;
	}

	public void setA_id(int a_id) {
		this.a_id = a_id;
	}

	public String getAddLine1() {
		return addLine1;
	}

	public void setAddLine1(String addLine1) {
		this.addLine1 = addLine1;
	}

	public String getAddLine2() {
		return addLine2;
	}

	public void setAddLine2(String addLine2) {
		this.addLine2 = addLine2;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Address() {
		super();
	}

	public Address(int a_id, String addLine1, String addLine2, City city, State state) {
		super();
		this.a_id = a_id;
		this.addLine1 = addLine1;
		this.addLine2 = addLine2;
		this.city = city;
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [a_id=" + a_id + ", addLine1=" + addLine1 + ", addLine2=" + addLine2 + ", city=" + city
				+ ", state=" + state + "]";
	}
	
	

}
