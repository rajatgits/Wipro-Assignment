package com.wipro.lamda;

import java.util.Scanner;
import java.util.function.Supplier;

public class Main {
	public static void main(String[] args) {
//		Predicate<Integer> ans = x -> x%2 == 0;		
		Scanner scanner = new Scanner(System.in);
		
//		int num = scanner.nextInt();
		String str = scanner.nextLine();
		
		Supplier<Integer> ans = () -> str.length();
		
		System.out.println(ans.get());
//		ans.accept(str);
//		
//		if(ans.test(num)) {
//			System.out.println("Even number");
//		} else {
//			System.out.println("Odd number");
//		}
		
		
	}
}
