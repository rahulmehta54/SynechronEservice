package com.eservice.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Value;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ServiceMan {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long s_id;
	private String s_name;
	private Number s_mobile;
	private String s_email;
	private int status;
	
	@OneToOne 
	private Category s_category;
	
	@OneToOne 
	private Address s_address;
	
	private int s_experience;
	
	@Value("0")
	private int s_bookingStatus;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name= "serviceman_inspectionRate")
	private List<InspectionCharge> s_inspectionRate;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "s_createDate")
	private Date s_createDate;
	
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "s_modifyDate")
	private Date s_modifyDate;
	

	
}
