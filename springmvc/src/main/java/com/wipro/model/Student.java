package com.wipro.model;

public class Student {
	private Integer id;
	private String name;
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
	public Student(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	public Student() {
		
	}
	@Override
	public String toString() {
		return "Student [" + id + " " + name + "]";
	}
}
