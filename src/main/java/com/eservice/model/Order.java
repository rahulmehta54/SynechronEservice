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
	private long o_id;
	
	private String o_orderStatus;
	
	@OneToOne
	private User o_user;
	
	@OneToOne
	private ServiceMan o_serviceMan;
	
	@OneToOne
	private InspectionCharge o_charges;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "o_createDate")
	private Date o_createDate;
	
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "o_modifyDate")
	private Date o_modifyDate;
}
