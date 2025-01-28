package com.wipro.oops;

public class Student {
	String name;
	int roll;
	static String collegeName = "Wipro"; // Static variables doesn't depend on object, it is created only at the of compilation using class loader
	
//	Student() {
//		 
//		 It will assign default values for name as null and roll as 0
//		 
//	}
	
	// User defined Default constructor, It is defined only once  in a class
	Student() {
		System.out.println("Default construtor");
		name = "Rajat Raj"; // It will be null when we don't initialize name, and set the value;
		roll = 10; // It will be
	}
	
	// Parameterized constructor, We can define any number of this constructor
	Student(String r, int s) {
		System.out.println("Parameterized constructor");
		name  = r;
		roll = s;
	}
	
	void display() {
		System.out.println("Student name : " + name);
		System.out.println("Student Roll no. : " + roll);
	}
	
	public static void main(String[] args) {
		Student student1 = new Student();
//		Student student2 = new Student("RR", 15);
		System.out.println("Collene name : " + Student.collegeName);
		
		student1.display();
//		student2.display();
	}

}
