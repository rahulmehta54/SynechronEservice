package com.example.demo.entity;

import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@Table(name="user")
public class User {

	private int id;
	private String email;
	private double mob;
	private String fname;
	private String lname;
	private String address;
	private String Usertype;
	private String cpassword;
	private String username;
}
