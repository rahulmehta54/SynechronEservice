package com.EServiceApp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Inspection {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long service_id;

	@Column
	private String service_name;

	@Column
	private String s_charges;

	@Column
	private String status;

	public long getService_id() {
		return service_id;
	}

	public void setService_id(long service_id) {
		this.service_id = service_id;
	}

	public String getService_name() {
		return service_name;
	}

	public void setService_name(String service_name) {
		this.service_name = service_name;
	}

	public String getS_charges() {
		return s_charges;
	}

	public void setS_charges(String s_charges) {
		this.s_charges = s_charges;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Inspection() {
		super();
	}

	public Inspection(long service_id, String service_name, String s_charges, String status) {
		super();
		this.service_id = service_id;
		this.service_name = service_name;
		this.s_charges = s_charges;
		this.status = status;
	}

	@Override
	public String toString() {
		return "Inspection [service_id=" + service_id + ", service_name=" + service_name + ", s_charges=" + s_charges
				+ ", status=" + status + "]";
	}

}
