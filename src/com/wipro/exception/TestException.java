package com.wipro.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int c;
		System.out.println("Enter first no. : ");
		int a = scanner.nextInt();
		
		System.out.println("Enter second no. : ");
		int b = scanner.nextInt();
		
		try {
			c = a/b;
		} catch(RuntimeException re) {
			if(re instanceof ArithmeticException) {
				System.out.println("Not divide by 0");
			}
			
			if(re instanceof InputMismatchException) {
				System.out.println("Enter the numericals");
			}
		} finally {
			System.out.println("This will always excuted");
		}
	
	}
}
