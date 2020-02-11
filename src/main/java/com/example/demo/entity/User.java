package com.example.demo.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class User {
	
	 private String username;
	  private String password;
	  private String firstname;
	  private String lastname;
	  private String email;
	  private String address;
	  private int phone;
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", firstname=" + firstname + ", lastname="
				+ lastname + ", email=" + email + ", address=" + address + ", phone=" + phone + "]";
	}
	
	  
}
