package com.app.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import com.app.core.Student;
import com.app.core.Course;

import com.app.cust_excs.StudentHandlingException;

public class ValidationRules {

	public static final int MAX_SIZE, MIN_SIZE, MAX_MARKS, MIN_MARKS;
	public static SimpleDateFormat sdf;
	public static Date date = new Date();

	static {
		MAX_SIZE = 10;
		MIN_SIZE = 4;
		MAX_MARKS = 100;
		MIN_MARKS = 0;
		sdf = new SimpleDateFormat("dd-MM-yyyy");
		try {
			date = sdf.parse("1-1-1985");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String checkPRN(String s1, HashMap<String,Student> students) throws StudentHandlingException {	//PRN Dup check
		if(students.containsKey(s1))						//Internally Calls equals of String class
			throw new StudentHandlingException("Duplicate PRN!!!");
		return s1;
	}
	
	public static String validateName(String s) throws StudentHandlingException {			//Name Length check
		if (s.length() < MIN_SIZE)
			throw new StudentHandlingException("Name must be atleast 4 Character long");
		if (s.length() > MAX_SIZE)
			throw new StudentHandlingException("Name must be less than 10 Characters");
		return s;
	}

	

	public static String validateEmail(String s) throws StudentHandlingException {			//Email validity check
		if (s.length() < MIN_SIZE)
			throw new StudentHandlingException("Email must be atleast 4 Character long");
		if (s.length() > MAX_SIZE)
			throw new StudentHandlingException("Email must be less than 10 Characters");
		if (!s.contains("@") || !s.contains("."))
			throw new StudentHandlingException("Invalid Email!!");
		return s;
	}

	public static Course validateCourse(String s) throws StudentHandlingException		//basically converts string to enum--->value of
	{
		/*
		 * if(!(s.equalsIgnoreCase("dac") || s.equalsIgnoreCase("dmc") ||
		 * s.equalsIgnoreCase("dbdac") || s.equalsIgnoreCase("dai"))) throw new
		 * StudentHandlingException("Invalid Course name!!");
		 */
		try {
			return Course.valueOf(s.toUpperCase());
		}catch(Exception e)
		{
			throw new StudentHandlingException("No Matching Course found for the Course: [ "+s+" ]");
		}
	}
	
	public static int validateMarks(int s) throws StudentHandlingException
	{
		if(s<MIN_MARKS || s>MAX_MARKS)
			throw new StudentHandlingException("Invalid Marks(Must be between 0 to 100)!!");
		return s;
	}
	
	public static Date validateDate(String d) throws ParseException, StudentHandlingException
	{
		Date dt = sdf.parse(d);
		if(dt.before(date))
			throw new StudentHandlingException("Invalid Date! It should be before 1st Jan 1985");
		return dt;
	}

}
