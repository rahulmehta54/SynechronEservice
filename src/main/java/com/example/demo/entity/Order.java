package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ordertbl")
public class Order {

	@Id
	private int order_id;
	private int service_id;
	private String service_name;
	private double contact_no;
	private String issue;
	private int amount;
	private String pay_mode;
	private String category;
	private int cust_id;

}
