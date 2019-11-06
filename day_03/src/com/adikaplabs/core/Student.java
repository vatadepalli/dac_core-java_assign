package com.adikaplabs.core;

public class Student {
	private int id;
	public static int idCounter;
	private String name;
	private String email;
	private int age;
	private double gpa;

	public Student(String name, String email, int age) {
		this.id = idCounter + 1;
		this.name = name;
		this.email = email;
		this.age = age;
		idCounter++;
	}

	public String getDetails() {
		return "" + id + "\n" + name + "\n" + email + "\n" + age + "\n" + gpa;
	}

	public Double computeGPA(Double quiz, Double test, Double assignments) {
		this.setGpa(0.2 * quiz + 0.5 * test + 0.3 * assignments);
		return this.getGpa();
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
}
