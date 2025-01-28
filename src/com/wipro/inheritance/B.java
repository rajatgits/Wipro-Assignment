package com.wipro.inheritance;

public class B extends A {
	
	 B() {
		super(); // This keyword is used to call the parent class properties
	 }
	
	 void sub(int a, int b) {
		 System.out.println(a-b);
	 }
}
