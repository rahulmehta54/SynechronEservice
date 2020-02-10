package com.EServiceApp.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Cart {

	@Id
	private int cart_id;
	
	@OneToOne(cascade = CascadeType.ALL)
	private User user;

	@OneToOne(cascade = CascadeType.ALL)
	private Serviceman s_man;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Inspection charge;
	
	private int status;

	public int getCart_id() {
		return cart_id;
	}

	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Serviceman getS_man() {
		return s_man;
	}

	public void setS_man(Serviceman s_man) {
		this.s_man = s_man;
	}

	public Inspection getCharge() {
		return charge;
	}

	public void setCharge(Inspection charge) {
		this.charge = charge;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Cart() {
		super();
	}

	public Cart(int cart_id, User user, Serviceman s_man, Inspection charge, int status) {
		super();
		this.cart_id = cart_id;
		this.user = user;
		this.s_man = s_man;
		this.charge = charge;
		this.status = status;
	}

	@Override
	public String toString() {
		return "Cart [cart_id=" + cart_id + ", user=" + user + ", s_man=" + s_man + ", charge=" + charge + ", status="
				+ status + "]";
	}
	
	
}
