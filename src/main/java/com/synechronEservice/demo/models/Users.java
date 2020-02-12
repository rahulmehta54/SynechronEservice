package com.synechronEservice.demo.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity(name="users")
@NoArgsConstructor
public class Users {

	@Id
	@GeneratedValue
	private int id;
	private String firstName;
	
	private String lastName;
	private String passWord;
	@NotEmpty
	private String gender;
	private String role;
	private String emailId;
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getPassWord() {
		return passWord;
	}



	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getRole() {
		return role;
	}



	public void setRole(String role) {
		this.role = role;
	}



	public String getEmailId() {
		return emailId;
	}



	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}



	public List<UserServiceProviderBookingTracker> getUserserviceproviderlist() {
		return userserviceproviderlist;
	}



	public void setUserserviceproviderlist(List<UserServiceProviderBookingTracker> userserviceproviderlist) {
		this.userserviceproviderlist = userserviceproviderlist;
	}


	

	public Users(int id, String firstName, String lastName, String passWord, String gender, String role, String emailId,
			List<UserServiceProviderBookingTracker> userserviceproviderlist) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.passWord = passWord;
		this.gender = gender;
		this.role = role;
		this.emailId = emailId;
		this.userserviceproviderlist = userserviceproviderlist;
	}

	
	



	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}






	@OneToMany(targetEntity=UserServiceProviderBookingTracker.class,cascade=CascadeType.ALL)
	@JoinColumn(name="us_id",referencedColumnName="id")
	private List<UserServiceProviderBookingTracker> userserviceproviderlist;
}

