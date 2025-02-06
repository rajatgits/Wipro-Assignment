package com.wipro.spring_javaBased;

import java.util.List;

public class Student {
	private Integer id;
	private String name;
	private Address address;
	 
	public Student(Integer id, String name, Address address) {
	 
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public Student() {
		
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address2) {
		this.address = address2;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
}
