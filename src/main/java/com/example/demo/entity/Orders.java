package com.example.demo.entity;

import javax.persistence.Entity;

@Entity
public class Orders {

	
	private int id;
	private String name;
	private String paymentMode;
	private String addess;
	@Override
	public String toString() {
		return "Orders [id=" + id + ", name=" + name + ", paymentMode=" + paymentMode + ", addess=" + addess + "]";
	}
	
	
}
