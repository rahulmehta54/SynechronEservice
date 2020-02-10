package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {
	@Id
	private int userId;
	private String firstName;
	private String lastName;
	private int contactNum;
	
	private String password;
	
	@OneToMany(targetEntity=ServiceProviderBooked.class, cascade=CascadeType.ALL)
	@JoinColumn(name="user_id", referencedColumnName="userId")
	private ServiceProviderBooked sBook;

}
