package com.eservice.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
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
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long u_id;
	private String u_firstName;
	private String u_lastName;
	private Number u_mobile;
	private String u_userName;
	private String u_password;
	@OneToOne
	private Address u_address;
	
	@OneToOne
	private Role u_role;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "u_createDate")
	private Date u_createDate;
	
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "u_modifyDate")
	private Date u_modifyDate;

}
