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

@Entity
@Data
@NoArgsConstructor
public class ServiceProvider {

	@Id
	@GeneratedValue
    private int serviceId;
	private String firstName;
	private String lastName;
	private String city;
	private String category;
	private String photoLocation;
	
	@OneToMany(targetEntity=UserServiceProviderBookingTracker.class,cascade=CascadeType.ALL)
	@JoinColumn(name="service_id",referencedColumnName="serviceId")
	private List<UserServiceProviderBookingTracker> userserviceproviderlist;
}
