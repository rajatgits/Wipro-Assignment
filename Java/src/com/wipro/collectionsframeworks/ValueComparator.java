package com.wipro.collectionsframeworks;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class ValueComparator implements Comparator<Map.Entry<Long, Student>>{

	@Override
	public int compare(Entry<Long, Student> o1, Entry<Long, Student> o2) {
		return o2.getValue().getMarks().compareTo(o1.getValue().getMarks());
	}

}
