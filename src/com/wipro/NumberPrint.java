package com.wipro;

public class NumberPrint {
	public static void main(String[] args) {
		// For loop
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		// While loop
		int i = 1;
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		
		// Do while loop
		i = 1;
		do {
			System.out.println(i);
			i++;
		} while(i <= 10);
	}
}
