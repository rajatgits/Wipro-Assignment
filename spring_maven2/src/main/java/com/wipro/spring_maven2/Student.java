package com.wipro.spring_maven2;

import java.util.List;

public class Student {
	private Integer id;
	private String name;
	private List<String> address;
	 
	public Student(Integer id, String name, List<String> address) {
	 
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

	public List<String> getAddress() {
		return address;
	}


	public void setAddress(List<String> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
}
