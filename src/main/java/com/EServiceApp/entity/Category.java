package com.EServiceApp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Cid;
	@Column
	private String C_Name;
	@Column
	private int C_Status;

	public long getCid() {
		return Cid;
	}

	public void setCid(long cid) {
		Cid = cid;
	}

	public String getC_Name() {
		return C_Name;
	}

	public void setC_Name(String c_Name) {
		C_Name = c_Name;
	}

	public int getC_Status() {
		return C_Status;
	}

	public void setC_Status(int c_Status) {
		C_Status = c_Status;
	}

	public Category() {
		super();
	}

	public Category(long cid, String c_Name, int c_Status) {
		super();
		Cid = cid;
		C_Name = c_Name;
		C_Status = c_Status;
	}

	@Override
	public String toString() {
		return "Category [Cid=" + Cid + ", C_Name=" + C_Name + ", C_Status=" + C_Status + "]";
	}

}
