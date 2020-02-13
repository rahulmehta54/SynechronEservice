package com.eservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Entity
@Table(name="tbl_cart")
@Component
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@OneToOne
	private User user;

	@OneToOne
	private ServiceMan serviceMan;

	@OneToOne
	private InspectionRate rate;

	private int status;

}
