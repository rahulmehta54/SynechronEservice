package com.example.demo.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Cart")
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long cartId;
	private long userId;
	private long serviceId;
	
	/*
	 * @OneToMany private Set<UserInfo> user = new HashSet<>();
	 * 
	 * @OneToMany private Set<ServiceProviderInfo> provider = new HashSet<>();
	 */
	
	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", userId=" + userId + ", serviceId=" + serviceId + "]";
	}

	public long getCartId() {
		return cartId;
	}

	public void setCartId(long cartId) {
		this.cartId = cartId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getServiceId() {
		return serviceId;
	}

	public void setServiceId(long serviceId) {
		this.serviceId = serviceId;
	}

	public Cart(long cartId, long userId, long serviceId) {
		super();
		this.cartId = cartId;
		this.userId = userId;
		this.serviceId = serviceId;
	}

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
