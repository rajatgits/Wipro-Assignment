package com.wipro.junit;

public class Calculator {
	public int sum(int a, int b) {
		return a + b;
	}
	
	public int sub(int a, int b) {
		return a - b;
	}
	
	public double divide(int a, int b) {
		if(b == 0) {
			throw new ArithmeticException("Divided by 0");
		}
		return a/b;
	}
}
