package com.prototype.dana.model;

public class User {
	
	private String first_name;
	private String last_name;
	private String email_address;
	private String password; 
	private String phone_number;
//	private String city;
//	private String zipcode;
//	private String image;
	
	public User(String fName, String lName, String eAddress,
			String pword, String phnNum) {
		super();
		this.first_name = fName;
		this.last_name = lName;
		this.email_address = eAddress;
		this.password = pword;
		this.phone_number = phnNum;
	}
	
	public String getFirstName() {
		return this.first_name;
	}
	public String getLastName() {
		return this.last_name;
	}
	public String getEmailAddress() {
		return this.email_address;
	}
	public String getPhoneNumber() {
		return this.phone_number;
	}
	
	public void setFirstName(String fName) {
		this.first_name = fName;
	}
	public void setLastName(String lName) {
		this.last_name = lName;
	}
	public void setEmailAddress(String eAdd) {
		this.email_address = eAdd;
	}
	public void setPhoneNumber(String phnNbr) {
		this.phone_number = phnNbr;
	}
	public void setPassword(String pswd) {
		this.password = pswd;
	}
}
