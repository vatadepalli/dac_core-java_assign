package com.app.core;

import java.util.Date;

import static com.app.utils.ValidationRules.*;

public class Student implements Comparable<Student> {

	private String prn, name, email;
	private int marks;
	private Date dob;
	private Course course;


	public void setMarks(int marks) {
		this.marks = marks;
	}


	public String getName() {
		return name;
	}


	public String getEmail() {
		return email;
	}


	public int getMarks() {
		return marks;
	}

	
	public Date getDob() {
		return dob;
	}

	public Course getCourse() {
		return course;
	}

	public Student(String prn, String name, String email, int marks, Course course, Date dob) {
		this.prn = prn;
		this.name = name;
		this.email = email;
		this.marks = marks;
		this.course = course;
		this.dob = dob;
	}

	public Student(String prn) { // CTOR for validating prn and using equals method
		this.prn = prn;
	}

	
	public String getPrn() {
		return prn;
	}

	@Override
	public String toString() {
		return "Student: PRN: " + prn + " Name: " + name + " Email: " + email + " Marks: " + marks + " Course: "
				+ course + " DOB: " + sdf.format(dob);
	}

	@Override
	public boolean equals(Object o) {
		return o instanceof Student ? ((Student) o).prn.equals(prn) : false;
	}

	@Override
	public int compareTo(Student o) { // Used for Sorting
		return prn.compareTo(o.prn);
	}

}
