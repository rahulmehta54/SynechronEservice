package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Component
@Entity
@Table(name = "Cart")
public class Cart {
	@Id
	private int cartId;

	private int userId;
	private int serviceId;
	private int contact;
	private String serviceName;
	private String category;

	/*
	 * public Cart(int cartId, int userId, int serviceId, int contact, String
	 * serviceName, String category) { super(); this.cartId = cartId; this.userId =
	 * userId; this.serviceId = serviceId; this.contact = contact; this.serviceName
	 * = serviceName; this.category = category;
	 * 
	 * }
	 */

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	/*
	 * @Override public String toString() { return "Cart [cartId=" + cartId +
	 * ", userId=" + userId + ", serviceId=" + serviceId + ", contact=" + contact +
	 * ", serviceName=" + serviceName + ", category=" + category + "]"; }
	 */

}
