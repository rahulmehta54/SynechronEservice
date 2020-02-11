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
public class ServiceProvider {
	@Id
	@GeneratedValue
	private int sid;
	private String firstName;
	private String city;
	private String catagory;
	private double rates;
	private String contactNum;
	private int experience; 
	@OneToMany(targetEntity=ServiceProviderBooked.class, cascade=CascadeType.ALL)
	@JoinColumn(name="serv_id", referencedColumnName="sid")
	private List<ServiceProviderBooked> sBook;
}
