package com.adikaplabs.tester;

import java.util.Scanner;

import com.adikaplabs.core.Student;

public class TestStudent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter the number of Students: ");
		int number_of_students = sc.nextInt();
		Student students[] = new Student[number_of_students];

		int counter = number_of_students;
		while (counter > 0) {
			System.out.print("Please enter student name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Email: ");
			String email = sc.next();

			System.out.print("Age: ");
			int age = sc.nextInt();

			students[number_of_students - counter] = new Student(name, email, age);

			counter--;
		}

		counter = number_of_students;
		while (counter > 0) {
			System.out.print("Enter Quiz Marks: ");
			Double quiz = sc.nextDouble();
			System.out.print("Enter Test Marks: ");
			Double test = sc.nextDouble();
			System.out.print("Enter Assignment Marks: ");
			Double assign = sc.nextDouble();

			students[counter - 1].computeGPA(quiz, test, assign);

			counter--;
		}

		for (Student s : students)
			System.out.println(s.getDetails());

		Student topper = students[0];

		counter = number_of_students;
		while (counter > 0) {
			if (students[counter - 1].getGpa() > topper.getGpa()) {
				topper = students[counter - 1];
			}
			counter--;
		}

		System.out.println(topper.getDetails());
		sc.close();
	}
}
