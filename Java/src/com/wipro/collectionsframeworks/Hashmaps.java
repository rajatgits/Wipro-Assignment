package com.wipro.collectionsframeworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Hashmaps {
	public static void main(String[] args) {
//         	SortedMap<Student,Long> sm  = new TreeMap<>();
//			
//			Student a = new Student(10,"a");
//			Student b = new Student(4,"b");
//		    Student rajat = new Student(56,"rajat");
//			
//			sm.put(a, 986L);
//			sm.put(b, 765767L);
//			sm.put(rajat, 87L);
//			
//			for(Object o: sm.entrySet())
//			{
//				System.out.println(o);
//			}			
			
		
			SortedMap<Long, Student> map = new TreeMap<>();
			
			Student a = new Student(90,"a");
			Student b = new Student(43, "b");
			Student r = new Student(99, "r");
			
			map.put(123456L, a);
			map.put(2778717L, b);
			map.put(126218L, r);
			
			try {
				List<Map.Entry<Long, Student>> list = new ArrayList<>(map.entrySet());
				
				Collections.sort(list, new ValueComparator());
				
				for(Map.Entry<Long, Student> i : list) {
					System.out.println(i.getKey() + "->" + i.getValue().getMarks() + i.getValue().getName());
				}
			} catch (Exception e) {
				System.out.println("Catch");
			}
			
			
	}
		 
}
