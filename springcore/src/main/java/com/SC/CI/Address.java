package com.SC.CI;

public class Address {
	private String city;
	private int pincode;
	public Address() {
		// TODO Auto-generated constructor stub
		super();
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", pincode=" + pincode + "]";
	}
	public Address(String city, int pincode) {
		super();
		this.city = city;
		this.pincode = pincode;
	}
	
}
