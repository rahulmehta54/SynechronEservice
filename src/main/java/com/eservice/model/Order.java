package com.eservice.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_order")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long orderId;
	
	private String orderStatus;
	
	@OneToOne
	private User user;
	
	@OneToOne
	private ServiceMan serviceMan;
	
	@OneToOne
	private InspectionCharge charges;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createDate")
	private Date createDate;
	
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modifyDate")
	private Date modifyDate;
	
	@OneToOne
	private Cart cart;
}
