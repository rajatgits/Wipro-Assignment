package com.wipro.polymorphism;

public class A {
	
	// Compile time 
	
	void sum(int a, int b) {
		System.out.println(a+b);
	}
	
	void sum(String a, String b) {
		System.out.println(a+b);
	}
	
	
	// Run time
	void method() {
		System.out.print("Parent class");
	}
	
	public static void main(String[] args) {
		 A rr = new B(); // Upcasting
		 rr.method();
	}
}
