package com.restAPIs.Hotel.Model;

public class Hotel {
	
	String id;
	String city;
	String name;
	String rating;
	
	
	public Hotel(String id, String city, String name, String rating) {
		
		this.id = id;
		this.city = city;
		this.name = name;
		this.rating = rating;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getRating() {
		return rating;
	}


	public void setRating(String rating) {
		this.rating = rating;
	}
	
	
	
	

}
