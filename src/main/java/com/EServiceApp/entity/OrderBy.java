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
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Component
@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderBy {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private long orderId;

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

	
}
