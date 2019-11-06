package com.adikaplabs.tester;

import java.util.Scanner;

import com.adikaplabs.core.Calculator;

class TestCalculator {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the 1st Number");
		cal.setFirstNumber(sc.nextDouble());

		System.out.println("Enter the 2nd Number");
		cal.setSecondNumber(sc.nextDouble());
		

		System.out
				.println("Which Operation to perform\n" + "1. Add\n" + "2. Subtract\n" + "3. Multiply\n" + "4. Divide");
		int option = sc.nextInt();

		sc.close();
		
		switch (option) {
		case 1:
			System.out.println("Sum: " + cal.add());
			break;
		case 2:
			System.out.println("Difference: " + cal.subtract());
			break;
		case 3:
			System.out.println("Multiplication: " + cal.multiply());
			break;
		case 4:
			System.out.println("Division: " + cal.divide());
			break;
		}
		return;
	}
}