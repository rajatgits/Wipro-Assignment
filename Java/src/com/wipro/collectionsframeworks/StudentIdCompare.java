package com.wipro.collectionsframeworks;

import java.util.Comparator;

public class StudentIdCompare implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o2.getMarks().compareTo(o1.getMarks());
	}
	
}
