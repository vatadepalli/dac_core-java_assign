package com.app.Tester;


import static com.app.utils.CollectionUtils.populateStudent;
import static com.app.utils.ValidationRules.checkPRN;
import static com.app.utils.ValidationRules.sdf;
import static com.app.utils.ValidationRules.validateCourse;
import static com.app.utils.ValidationRules.validateDate;
import static com.app.utils.ValidationRules.validateEmail;
import static com.app.utils.ValidationRules.validateMarks;
import static com.app.utils.ValidationRules.validateName;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

import com.app.core.Student;
import com.app.core.Course;

import com.app.cust_excs.StudentHandlingException;

public class TestHM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner sc = new Scanner(System.in)) {
			HashMap<String, Student> students = populateStudent();
			boolean exit = false;
			while (!exit) {
				try {
					System.out.println("******* Menu *******");
					System.out.println(
							"1.New Student Admission\n" + "2.Display Student Details\n" + "3.Update Student Marks\n"
									+ "4.Cancel Admission\n" + "5.Display all Students\n" + "6.Exit");
					System.out.println("Enter ur Choice:");
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter New Student Details (PRN,Name,Email,Marks,Course "
								+ Arrays.toString(Course.values()) + ",DOB(" + sdf.toPattern() + "))");
						String prn = sc.next();
						students.putIfAbsent(checkPRN(prn, students),
								new Student(checkPRN(prn, students), validateName(sc.next()), validateEmail(sc.next()),
										validateMarks(sc.nextInt()), validateCourse(sc.next()),
										validateDate(sc.next())));
						System.out.println("Admission Successful!!");
						break;
					case 2:
						System.out.println("Enter PRN to view Details:");
						String p = sc.next();
						Student s = students.get(p);
						if (s == null)
							throw new StudentHandlingException("No Student Found!\n");
						System.out.println(s);
						break;
					case 3:
						System.out.println("Enter PRN & New Marks to update Marks: ");
						String p1 = sc.next();
						int m = validateMarks(sc.nextInt());
						if (students.get(p1) == null)
							throw new StudentHandlingException("No Student Found!\n");
						students.get(p1).setMarks(m);
						break;
					case 4:
						System.out.println("Enter PRN to Cancel Admission!");
						String p2 = sc.next();
						if (students.get(p2) == null)
							throw new StudentHandlingException("No Student Found!\n");
						Student rs = students.remove(p2);
						System.out.println("Poor Student " + rs.getName() + " Rusticated successfully!");
						break;
					case 5:
						// System.out.println("Thanks for using Student portal");
						for (Student ss : students.values()) {
							if (ss == null)
								throw new StudentHandlingException("No Student Found!!");
							System.out.println(ss);
						}
						break;
					case 6:
						System.out.println("Thanks for using Student portal");
						break;
					default:
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				sc.nextLine();
			}
		}

	}

}
