package com.adikaplabs.tester;

import java.util.Scanner;

import com.adikaplabs.core.*;
import static com.adikaplabs.core.Employee.*;


public class TestOrg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Employees");
		Employee[] emps = new Employee[sc.nextInt()];
		
		String name, email, deptId;
		double basic, perfBonus, hourlyRate, hoursWorked, increment;
		int empId;
		
		boolean loop = true;
		int option = 0;
		while (loop) {
			
			System.out.println("Please select an option ...\n");
			System.out.println("1. Hire Manager");
			System.out.println("2. Hire Worker");
			System.out.println("3. Display all employees with salaries");
			System.out.println("4. Display employee specific details");
			System.out.println("5. Increment salary of employees");
			System.out.println("\n10. EXIT");

			option = sc.nextInt();

			switch (option) {
			case 1:
				// Hire manager
				System.out.println("Please enter the manager details \n");
				System.out.println("Name : ");
				sc.nextLine();
				name = sc.nextLine();
				System.out.println("Email: ");
				email = sc.next();
				System.out.println("Department ID: ");
				deptId = sc.next();
				System.out.println("Basic Salary: ");
				basic = sc.nextDouble();
				System.out.println("Performance Bonus: ");
				perfBonus = sc.nextDouble();

				emps[idCounter - 100] = new Manager(name, email, deptId, basic, perfBonus);
				break;
			case 2:
				// Hire Work
				System.out.println("Please enter the worker details \n");
				System.out.println("Name : ");
				sc.nextLine();
				name = sc.nextLine();
				System.out.println("Email: ");
				email = sc.next();
				System.out.println("Department ID: ");
				deptId = sc.next();
				System.out.println("Basic Salary: ");
				basic = sc.nextDouble();
				System.out.println("Hourly Rate: ");
				hourlyRate = sc.nextDouble();
				System.out.println("Hours Worked: ");
				hoursWorked = sc.nextDouble();

				emps[idCounter - 100] = new Worker(name, email, deptId, basic, hourlyRate, hoursWorked);
				break;
			case 3:
				for (Employee e : emps) {
					if (e != null)
						System.out.println(e);
				}
				break;
			case 4:
				System.out.println("Enter employee ID: ");
				// Check if employee id is valid
				empId = sc.nextInt();
				if (empId < 100 || empId > idCounter)
					System.out.println("\nError: Invalid Employee ID\n");
				else {
					for (Employee e : emps) {
						if (e != null && e.getId() == empId) {
							System.out.println(e);
							break;
						}
					}
					System.out.println("\nError: Invalid Employee ID\n");
				}
				break;
			case 5:
				System.out.println("Please enter employee ID");
				empId = sc.nextInt();
				System.out.println("Please enter the increment");
				increment = sc.nextDouble();
				if (empId < 100 || empId > idCounter)
					System.out.println("\nError: Invalid Employee ID\n");
				else {
					for (Employee e : emps) {
						if (e != null && e.getId() == empId) {
							e.setBasic(increment + e.getBasic());
							System.out.println(e);
						}
					}
				}

				break;
			case 10:
				sc.close();
				loop = false;

				break;

			default:
				break;
			}
		}
	}
}
