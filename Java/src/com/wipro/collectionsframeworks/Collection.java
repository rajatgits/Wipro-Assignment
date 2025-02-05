package com.wipro.collectionsframeworks;

import java.util.List;
import java.util.Map.Entry;
import java.util.TreeSet;

public class Collection {
	public static void main(String[] args) {
		
		TreeSet<Integer> treeSet = new TreeSet<>();
		
		treeSet.add(1);
		treeSet.add(10);
		treeSet.add(5);
		treeSet.add(3);
		treeSet.add(6);
		treeSet.add(15);
		
		System.out.println(treeSet);
		
		TreeSet<Student> set = new TreeSet<>(new StudentIdCompare());
		
		set.add(new Student(100, "Rajat Raj"));
		set.add(new Student(66, "A"));
		set.add(new Student(99, "B"));
		set.add(new Student(86, "C"));
		set.add(new Student(87, "D"));
		set.add(new Student(90, "S"));
		
		System.out.println(set);
	}

}
