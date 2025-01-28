package com.wipro.abstraction;

public interface i2 {
	// Static method can be defined inside an interface
	public static void display() {
		System.out.print("Called from static");
	}

	// Default method in interface need to called by using the class
	public default void method() {
		System.out.print("Called from default");
	}
	
	public default void method1() {
		System.out.print("Method 1");
	}
	
	public static void main(String[] args) {
		i2.display();
	}
}
