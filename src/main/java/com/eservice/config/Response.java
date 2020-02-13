package com.eservice.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Response {

	private String status;
	private Object object;
	
	public Response(String status) {
		super();
		this.status = status;
	}

	
	
}
