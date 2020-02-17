package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@Component
@AllArgsConstructor
@Table(name = "order_table")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int order_Id;
	
	private int service_id;
	private String service_name;
	private long contact_no;
	private String issue;
	private int amount;
	private String pay_mode;
	private String category;
	private int user_id;
	private int cart_id;

	public Order() {
		super();
	}

}
