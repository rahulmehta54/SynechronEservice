package com.example.demo.entity;


public class Admin {
	
	private String name;
	private String emailId;
	private String pass;
	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(String name, String emailId, String pass) {
		super();
		this.name = name;
		this.emailId = emailId;
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "Admin [name=" + name + ", emailId=" + emailId + ", pass=" + pass + "]";
	}
	
	
	

}
