package com.wipro.oops;

public class Employee {
	String empname;
	int empid;
	
	Employee(String name, int id) {
		empname = name;
		empid = id;
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee("Rajat Raj", 1);
		System.out.println("Employee name : " + emp.empname);
		System.out.println("Employee Id : " + emp.empid);
	}
}
