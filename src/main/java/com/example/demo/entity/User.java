package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
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
public class User {

	@Id
	@GeneratedValue
	private int userID;
	private String firstName;
	private String lastName;
	private String role;
	private String emailID;
	private String userPassword;
	
	@OneToMany(targetEntity=ServiceProviderBooked.class, cascade=CascadeType.ALL)
	@JoinColumn(name="user_id", referencedColumnName="UserID")
	private List<ServiceProviderBooked> sBook;
}
