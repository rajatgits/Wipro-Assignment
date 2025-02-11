package com.wipro.spring_autodiscovery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("1")
	private Integer id;
	@Value("RajatRaj")
	private String student;
	@Autowired
	private Address address;
	
	public Student(Integer id, String student, Address address) {
		this.id = id;
		this.student = student;
		this.address = address;
	}
	
	public Student() {
		
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", student=" + student + ", address=" + address + "]";
	}
}
