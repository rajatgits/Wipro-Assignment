package com.wipro.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
  
public class Main {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("a", "b", "c", "d", "e", "f", "g");
		List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6);
		List<List<String>> list1 = Arrays.asList(Arrays.asList("a", "b", "c", "d", "e", "f", "g"), Arrays.asList("h", "i","j", "k", "l", "m"));
 		
		// Uppercase
		list.stream().map(x -> x.toUpperCase()).forEach(x -> System.out.print(x));
		
		// Even
		number.stream().filter(x -> x%2 == 0).forEach(x -> System.out.println(x));
		
		// Ascending
		number.stream().sorted().forEach(x -> System.out.println(x));
		
		// Descending
		number.stream().sorted((x, y) -> y.compareTo(x)).forEach(x -> System.out.println(x));
		
		// Distinct
		number.stream().distinct().forEach(x -> System.out.println(x));
		
		// Accumulate
		int sum = number.stream().reduce(0, (a, b) -> a + b);
		System.out.println(sum);
		
		// Flatten
		List<String> ans = list1.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
		System.out.println(ans);
	}
}