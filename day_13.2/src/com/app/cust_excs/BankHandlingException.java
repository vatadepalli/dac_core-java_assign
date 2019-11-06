package com.app.cust_excs;

@SuppressWarnings("serial")
public class BankHandlingException extends Exception {
	public BankHandlingException(String mesg) {
		super(mesg);
	}
}

