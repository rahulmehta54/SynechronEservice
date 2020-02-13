package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="cart")
public class Cart {

	@Id
	private int cart_id;
	private int service_id;
	private String Servicemen_name;
	private int contact;
	private String category;
	private int user_id;
	
}
