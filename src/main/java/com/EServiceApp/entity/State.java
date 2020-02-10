package com.EServiceApp.entity;

import javax.management.loading.PrivateClassLoader;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class State {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String s_name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public State() {
		super();
	}

	public State(int id, String s_name) {
		super();
		this.id = id;
		this.s_name = s_name;
	}

	@Override
	public String toString() {
		return "State [id=" + id + ", s_name=" + s_name + "]";
	}

}
