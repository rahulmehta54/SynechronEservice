package com.synechronEservice.demo.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class UserServiceProviderBookingTracker {
    
	@Id
	private int userServiceId;
	private Date bookingDate;
	private boolean isPaymentCompleted;
	
}
