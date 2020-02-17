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
    private int serviceId;
	private String firstName;
	private String lastName;
	private String city;
	private String category;
	private long charges;
	
	@OneToMany(targetEntity=ServiceProviderBooked.class, cascade=CascadeType.ALL)
	@JoinColumn(name="serv_id", referencedColumnName="serviceId")
	private List<ServiceProviderBooked> sBook;
	
}
