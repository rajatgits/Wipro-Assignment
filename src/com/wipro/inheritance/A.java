package com.wipro.inheritance;

public class A {
	A() {
		// This constructor is directly called without super keyword also
	}
	
	A(int a) {
		// This constructor is called when we use super keyword with parameter
	}
	
	void sum(int a, int b) {
		System.out.println(a+b);
	}
}
