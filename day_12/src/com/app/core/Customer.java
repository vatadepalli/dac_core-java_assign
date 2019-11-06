package com.app.core;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;

import static com.app.utils.CustomerValidations.*;
import com.app.cust_excs.CustomerHandlingException;

@SuppressWarnings("serial")
public class Customer implements Serializable{

	String email, password;
	Double regAmount;
	Date regDate;

	private CustType custType;
	private HashMap<String, Address> addressMap;
	
	public Customer(String email, String password, double regAmount, Date regDate, CustType custType) {
		this.email = email;
		this.password = password;
		this.regAmount = regAmount;
		this.regDate = regDate;
		this.custType = custType;
		addressMap = new HashMap<String, Address>();
	}

	public void linkAddress(String type, String city, String state, String country, String phoneNo)
			throws CustomerHandlingException {
		if (addressMap.putIfAbsent(type, new Address(type, city, state, country, phoneNo)) != null)
			throw new CustomerHandlingException("Customer already has a " + type + " address");
	}

	public HashMap<String, Address> getAddresses() {
		return addressMap;
	}
	
	// GETTERS
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public double getRegAmount() {
		return regAmount;
	}
	public Date getRegDate() {
		return regDate;
	}
	public CustType getCustType() {
		return custType;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Customer ===> [Email:"+email+" Registration Amount: "+regAmount+" Registration Date: "+sdf.format(regDate)+" CustomerType: "+custType+"]";
	}

}
