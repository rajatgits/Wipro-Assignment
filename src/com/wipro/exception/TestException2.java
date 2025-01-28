package com.wipro.exception;

import java.util.Scanner;

public class TestException2 extends Exception{
	public static void main(String[] args) {
		Method obj = new Method();
		
		try {
			obj.divide();
		} catch (ArithmeticException e) {
			System.out.println("Not divide by 0");
		}
	}
}
