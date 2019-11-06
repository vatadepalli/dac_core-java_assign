package com.app.utils;

import java.util.HashMap;

import com.app.core.Student;
import com.app.core.Course;

import static com.app.utils.ValidationRules.*;

public class CollectionUtils {

	public static HashMap<String, Student> populateStudent()
	{
		HashMap<String, Student> hm = new HashMap<>();
		try {
			hm.put("dac-333",new Student(checkPRN("dac-11",hm),"Banna","banna@g.c",89,validateCourse("dac"),validateDate("27-07-1995")));
			hm.put("dac-222",new Student(checkPRN("dac-22",hm),"Aditya","aditya@g.c",88,validateCourse("dbda"),validateDate("27-07-1995")));
			hm.put("dac-444",new Student(checkPRN("dac-33",hm),"Kapil","kapil@g.c",66,validateCourse("dac"),validateDate("02-05-1988")));
			hm.put("dac-111",new Student(checkPRN("dac-44",hm),"Abishek","abishek@g.c",99,validateCourse("dac"),validateDate("27-07-1995")));
			hm.put("dac-666",new Student(checkPRN("dac-55",hm),"Venkat","vemkat@g.c",66,validateCourse("dai"),validateDate("03-12-1986")));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return hm;
	}
	
}
