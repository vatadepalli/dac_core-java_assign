package com.app.cust_excs;

public class CustomerHandlingException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomerHandlingException(String errMsg) {
		super(errMsg);
	}
}
