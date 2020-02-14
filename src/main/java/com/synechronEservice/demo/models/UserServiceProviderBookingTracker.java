package com.synechronEservice.demo.models;

import java.util.Date;

import javax.management.loading.PrivateClassLoader;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class UserServiceProviderBookingTracker {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userServiceId;
	private String bookingDate;
	private boolean isPaymentCompleted;
}
