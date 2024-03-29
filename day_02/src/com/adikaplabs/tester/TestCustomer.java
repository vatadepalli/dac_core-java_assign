package com.adikaplabs.tester;

import java.util.Scanner;

import com.adikaplabs.core.Customer;

public class TestCustomer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // No Param Const
        Customer cust_1 = new Customer();
        System.out.println(cust_1.getDetails());

        // Get Details using Scanner
        System.out.println("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Email: ");
        String email = sc.next();

        System.out.println("Enter Age");
        int age = sc.nextInt();

        System.out.println("Enter Credit Limit");
        Double creditLimit = sc.nextDouble();

        // Four Param Const
        Customer cust_2 = new Customer(name, email, age, creditLimit);
        System.out.println(cust_2.getDetails());

        // Three Param Const
        Customer cust_3 = new Customer(name, email, age);
        System.out.println(cust_3.getDetails());

        cust_1.setCreditLimit(cust_1.getCreditLimit() + 1000);
        System.out.println(cust_1.getDetails());
        sc.close();

    }
}