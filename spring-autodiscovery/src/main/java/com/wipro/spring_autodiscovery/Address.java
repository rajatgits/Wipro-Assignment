package com.wipro.spring_autodiscovery;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("Secunderbad, Hyderabad")
	private String city;
	@Value("Telangana")
	private String state;
	public Address(String city, String state) {
		this.city = city;
		this.state = state;
	}
	public Address() {
		
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
}
