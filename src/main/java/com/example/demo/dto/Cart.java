package com.example.demo.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_cart")
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cartId;

	// java bean naming conventions should be used - first character and second character should not be uppercase
	private String fName;
	private String lName;
	private String category;
	private String mobile;
	private String city;
	private int userId;
	private int sId;
	private int active;

	public Cart() {
	}

	public Cart(int cartId, String fName, String lName, String category, String mobile, String city, int userId,
			int sId, int active) {
		this.cartId = cartId;
		this.fName = fName;
		this.lName = lName;
		this.category = category;
		this.mobile = mobile;
		this.city = city;
		this.userId = userId;
		this.sId = sId;
		this.active = active;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", fName=" + fName + ", lName=" + lName + ", category=" + category
				+ ", mobile=" + mobile + ", city=" + city + ", userId=" + userId + ", sId=" + sId + ", active=" + active
				+ "]";
	}
}
