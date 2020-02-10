package com.synechronEservice.demo.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity(name="users")
@NoArgsConstructor
public class Users {

	@Id
	@GeneratedValue
	private int id;
	private String firstName;
	private String lastName;
	private String passWord;
	private String gender;
	private String role;
	private String emailId;
	
	@OneToMany(targetEntity=UserServiceProviderBookingTracker.class,cascade=CascadeType.ALL)
	@JoinColumn(name="us_id",referencedColumnName="id")
	private List<UserServiceProviderBookingTracker> userserviceproviderlist;
}

