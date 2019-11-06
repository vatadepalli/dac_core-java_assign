package com.app.utils;

import java.util.ArrayList;

import com.app.core.Student;
import com.app.core.Course;

import static com.app.utils.ValidationRules.*;

public class CollectionUtils {

	public static ArrayList<Student> populateStudent()
	{
		ArrayList<Student> l1 = new ArrayList<Student>();
		try {
			l1.add(new Student("dac-333","Aditya","adi@g.c",89,validateCourse("dac"),validateDate("27-07-1995")));
			l1.add(new Student("dac-222","Vijaya","vijaya@g.c",88,validateCourse("dbda"),validateDate("27-07-1995")));
			l1.add(new Student("dac-444","kapil","kapil@g.c",66,validateCourse("dac"),validateDate("02-05-1988")));
			l1.add(new Student("dac-111","venky","venky@g.c",99,validateCourse("dac"),validateDate("27-07-1995")));
			l1.add(new Student("dac-666","banna","banna@g.c",66,validateCourse("dai"),validateDate("03-12-1986")));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return l1;
	}

	
	
}
