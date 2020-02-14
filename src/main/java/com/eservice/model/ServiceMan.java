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
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ServiceMan {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long serviceId;
	private String serviceName;
	private long mobile;
	private String email;
	private int status;
	
	@OneToOne 
	private Category category;
	
	@OneToOne 
	private Address address;
	
	private int experience;
	
	@Value("1")
	private int bookingStatus;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name= "servicemanInspectionRate")
	private List<InspectionCharge> inspectionRate;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createDate")
	private Date createDate;
	
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modifyDate")
	private Date modifyDate;
	
	private long inspectionCharge;
	

	
}
