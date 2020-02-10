package com.example.demo.entity;

import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@Table(name="cart")
public class Cart {

	private int service_id;
	private String Servicemen_name;
	private int contact;
	private String category;
	private int user_id;
	
}
