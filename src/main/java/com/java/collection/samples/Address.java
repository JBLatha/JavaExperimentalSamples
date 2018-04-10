package com.java.collection.samples;

public class Address {
	
	String street;
	String state;
	Integer pincode;
	
	public Address(String street,String state,Integer pincode){
		this.street = street;
		this.state = state;
		this.pincode = pincode;
	}
	
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	
	

}
