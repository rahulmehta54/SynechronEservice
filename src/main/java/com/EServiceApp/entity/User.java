package com.EServiceApp.entity;

import java.util.Date;

import javax.management.loading.PrivateClassLoader;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long u_id;

	@Column
	private String u_firstName;

	@Column
	private String u_LastName;

	@Column
	private String userName;

	@Column
	private String password;

	@Column
	private String mobileNumber;

	@OneToOne(cascade = CascadeType.ALL)
	private Address address;

	@OneToOne(cascade = CascadeType.ALL)
	private Role role;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "s_createDate")
	private Date s_createDate;

	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "s_modifiedDate")
	private Date s_modifiedDate;

	public long getU_id() {
		return u_id;
	}

	public void setU_id(long u_id) {
		this.u_id = u_id;
	}

	public String getU_firstName() {
		return u_firstName;
	}

	public void setU_firstName(String u_firstName) {
		this.u_firstName = u_firstName;
	}

	public String getU_LastName() {
		return u_LastName;
	}

	public void setU_LastName(String u_LastName) {
		this.u_LastName = u_LastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Date getS_createDate() {
		return s_createDate;
	}

	public void setS_createDate(Date s_createDate) {
		this.s_createDate = s_createDate;
	}

	public Date getS_modifiedDate() {
		return s_modifiedDate;
	}

	public void setS_modifiedDate(Date s_modifiedDate) {
		this.s_modifiedDate = s_modifiedDate;
	}

	public User() {
		super();
	}

	public User(long u_id, String u_firstName, String u_LastName, String userName, String password, String mobileNumber,
			Address address, Role role, Date s_createDate, Date s_modifiedDate) {
		super();
		this.u_id = u_id;
		this.u_firstName = u_firstName;
		this.u_LastName = u_LastName;
		this.userName = userName;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.role = role;
		this.s_createDate = s_createDate;
		this.s_modifiedDate = s_modifiedDate;
	}

	@Override
	public String toString() {
		return "User [u_id=" + u_id + ", u_firstName=" + u_firstName + ", u_LastName=" + u_LastName + ", userName="
				+ userName + ", password=" + password + ", mobileNumber=" + mobileNumber + ", address=" + address
				+ ", role=" + role + ", s_createDate=" + s_createDate + ", s_modifiedDate=" + s_modifiedDate + "]";
	}

}
