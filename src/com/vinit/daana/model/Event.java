package com.vinit.daana.model;

import java.util.ArrayList;

public class Event {

	public Event(String name, String date, String categories,
			String description, String address, String city, String zipcode,
			String image,ArrayList<User> users, String time) {
		super();
		this.name = name;
		this.date = date;
		this.categories = categories;
		this.description = description;
		this.address = address;
		this.city = city;
		this.zipcode = zipcode;
		this.image = image;
		this.users = users;
		this.time = time;
		
		
	}
	public String getName() {
		return name;
	}
	public ArrayList<User> getUsers() {
		return users;
	}
	public String getDate() {
		return date;
	}
	public String getCategories() {
		return categories;
	}
	public String getDescription() {
		return description;
	}
	public String getAddress() {
		return address;
	}
	public String getCity() {
		return city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public String getImage() {
		return image;
	}
	
	public String getTime() {
		return time;
	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public void setDate(String date) {
//		this.date = date;
//	}
//	public void setCategories(String categories) {
//		this.categories = categories;
//	}
//	public void setDescription(String description) {
//		this.description = description;
//	}
//	public void setAddress(String address) {
//		this.address = address;
//	}
//	public void setCity(String city) {
//		this.city = city;
//	}
//	public void setZipcode(String zipcode) {
//		this.zipcode = zipcode;
//	}
//	public void setImage(String image) {
//		this.image = image;
//	}
//	
	String name;
	String creator;
	String date;
	String categories;
	String description; 
	String address;
	String city;
	String zipcode;
	String image;
	ArrayList<User> users;
	String time;
	
}
