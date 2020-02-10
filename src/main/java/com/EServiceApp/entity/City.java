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
public class City {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int c_id;

	@Column
	private String c_name;

	@OneToOne
	private State state;

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public City() {
		super();
	}

	public City(int c_id, String c_name, State state) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.state = state;
	}

	@Override
	public String toString() {
		return "City [c_id=" + c_id + ", c_name=" + c_name + ", state=" + state + "]";
	}

}
