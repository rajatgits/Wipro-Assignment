package com.wipro.spring_javaBased;

public class Address {
	private String city;
	private String state;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Address(String city, String state) {
		this.city = city;
		this.state = state;
	}
	public Address() {
		
	}
	@Override
	public String toString() {
		return city + " " + state;
	}
}
