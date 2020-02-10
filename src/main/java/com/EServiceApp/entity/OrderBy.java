package com.EServiceApp.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table
public class OrderBy {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private long order_id;

	private String orderStatus;

	@OneToOne(cascade = CascadeType.ALL)
	private User user;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "serviceman")
	private Serviceman serviceman;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "i_charge")
	private Inspection i_charge;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "s_createDate")
	private Date s_createDate;

	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "s_modifiedDate")
	private Date s_modifiedDate;

	public long getOrder_id() {
		return order_id;
	}

	public void setOrder_id(long order_id) {
		this.order_id = order_id;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Serviceman getServiceman() {
		return serviceman;
	}

	public void setServiceman(Serviceman serviceman) {
		this.serviceman = serviceman;
	}

	public Inspection getI_charge() {
		return i_charge;
	}

	public void setI_charge(Inspection i_charge) {
		this.i_charge = i_charge;
	}

	public Date getS_createDate() {
		return s_createDate;
	}

	public void setS_createDate(Date s_createDate) {
		this.s_createDate = s_createDate;
	}

	public Date getS_modifiedDate() {
		return s_modifiedDate;
	}

	public void setS_modifiedDate(Date s_modifiedDate) {
		this.s_modifiedDate = s_modifiedDate;
	}

	public OrderBy() {
		super();
	}

	public OrderBy(long order_id, String orderStatus, User user, Serviceman serviceman, Inspection i_charge,
			Date s_createDate, Date s_modifiedDate) {
		super();
		this.order_id = order_id;
		this.orderStatus = orderStatus;
		this.user = user;
		this.serviceman = serviceman;
		this.i_charge = i_charge;
		this.s_createDate = s_createDate;
		this.s_modifiedDate = s_modifiedDate;
	}

	@Override
	public String toString() {
		return "OrderBy [order_id=" + order_id + ", orderStatus=" + orderStatus + ", user=" + user + ", serviceman="
				+ serviceman + ", i_charge=" + i_charge + ", s_createDate=" + s_createDate + ", s_modifiedDate="
				+ s_modifiedDate + "]";
	}

}
