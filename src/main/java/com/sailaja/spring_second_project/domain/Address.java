package com.sailaja.spring_second_project.domain;

public class Address {
	
	private String houseNo;
	
	private String streetName;

	private String city;
	
	private String country;

	public Address(String houseNo, String streetName, String city, String country) {
		super();
		this.houseNo = houseNo;
		this.streetName = streetName;
		this.city = city;
		this.country = country;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
	

}
