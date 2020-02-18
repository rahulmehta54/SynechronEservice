package com.example.demo.entity;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="user")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Scope("session")
public class User {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "id")
private Long id;
@Column(name = "email")
String email;
@Column(name = "name")
String name;
@Column(name = "city")
String city;
@Column(name = "password")
String password;
@Column(name = "phoneNumber")
int phoneNumber;
@Column(columnDefinition = "varchar(255) default 'user'",name="role")
String role;
@Override
public String toString() {
	return "User [id=" + id + ", email=" + email + ", name=" + name + ", city=" + city + ", password=" + password
			+ ", phoneNumber=" + phoneNumber + ", role=" + role + "]";
}


}
