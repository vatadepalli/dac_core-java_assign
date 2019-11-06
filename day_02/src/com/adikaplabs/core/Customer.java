package com.adikaplabs.core;

public class Customer {
    private String name;
	private String email;
	private int age;
    private Double creditLimit;

    public Customer(String name, String email, int age, Double creditLimit){
        this.name = name;
        this.email = email;
        this.age = age;
        this.creditLimit = creditLimit;
    }

    public Customer(){
        this.name = "Rama";
        this.email = "rama@gmail.com";
        this.creditLimit = 10000d;
    }
    public Customer(String name, String email, int age){
        this.name = name;
        this.email = email;
        this.age = age;
        this.creditLimit = 15000d;
    }

    public String getDetails() {
        return "Name: " + this.name + "\n" + "Credit Limit: " + this.creditLimit;
    }

    public Double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(Double creditLimit) {
        this.creditLimit = creditLimit;
    }
}