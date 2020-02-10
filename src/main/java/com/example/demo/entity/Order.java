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
@Table(name="order")
public class Order {

	private int service_id;
	private String service_name;
	private double contact_no;
	private String issue;
	private int amount;
	private String pay_mode;
	private String category;
	private long order_id;
	private int cust_id;
	
}
