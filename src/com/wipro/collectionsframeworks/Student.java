package com.wipro.collectionsframeworks;

public class Student implements Comparable<Student>{
	private Integer marks;
	private String name;
	
	public Student(Integer marks, String name) {
		this.marks = marks;
		this.name = name;
	}
	
	public Integer getMarks() {
		return marks;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Sudent [marks=" + marks + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student o) {
		return this.getMarks().compareTo(o.getMarks());
	}

	
}
