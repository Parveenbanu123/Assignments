package com.mphasis;

import java.util.Comparator;

public class MarkComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return (int)(o1.getMarks()-o2.getMarks());
	}

}
