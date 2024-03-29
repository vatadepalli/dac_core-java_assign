package com.app.utils;

import java.util.HashMap;

import com.app.core.Customer;
import com.app.cust_excs.CustomerHandlingException;
import static com.app.utils.CustomerValidations.*;

public class CustomerUtils {
	
	public static HashMap<String, Customer> populateCustomer() throws CustomerHandlingException {
		HashMap<String, Customer> hm = new HashMap<String, Customer>();
		try {
			hm.putIfAbsent("aditya@gmail.com", new Customer("aditya@gmail.com", "1234#abc", 1000, validateRegDate("11-apr-2019"), validateCustType("platinum")));
			hm.putIfAbsent("venkat@gmail.com", new Customer("venkat@gmail.com", "12345678", 1000, validateRegDate("01-sep-2019"), validateCustType("silver")));
			hm.putIfAbsent("kapil@gmail.com", new Customer("kapil@gmail.com", "987654321", 1000,validateRegDate("11-apr-2019"), validateCustType("gold")));
			hm.putIfAbsent("banna@gmail.com", new Customer("banna@gmail.com", "qwerty", 1000, validateRegDate("11-jul-2018"), validateCustType("gold")));
			hm.putIfAbsent("abishek@gmail.com", new Customer("abishek@gmail.com", "asdfgh", 1000, validateRegDate("13-apr-2018"), validateCustType("platinum")));
			hm.get("aditya@gmail.com").linkAddress("Home", "Pune", "MH", "IN", "82467278");
			hm.get("aditya@gmail.com").linkAddress("Office", "Mumbai", "MH", "IN", "023845754");
			hm.get("venkat@gmail.com").linkAddress("Home", "Delhi", "Delhi", "IN", "7463576");
		} catch (Exception e) {
			throw new CustomerHandlingException("Couldn't Populate!");
		}
		return hm;
	}
	
	public static Customer authenticateCustomer(String email, String password, HashMap<String, Customer> customers)
			throws CustomerHandlingException {
		if (!customers.containsKey(email))
			throw new CustomerHandlingException("Enter a valid Email ID");
		if (!customers.get(email).getPassword().equals(password))
			throw new CustomerHandlingException("Incorrect Password");
		return customers.get(email);
	}

}
