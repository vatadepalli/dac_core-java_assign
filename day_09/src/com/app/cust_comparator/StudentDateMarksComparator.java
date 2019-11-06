package com.app.cust_comparator;

import java.util.Comparator;

import com.app.core.Student;

public class StudentDateMarksComparator implements Comparator<Student> {

	@Override
	public int compare(Student a1, Student a2) {
		int ret = a1.getDob().compareTo(a2.getDob());
		if(ret==0)
			return ((Integer)a1.getMarks()).compareTo(a2.getMarks());
		return ret;
	}

}
