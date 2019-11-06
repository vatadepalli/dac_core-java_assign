package com.app.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.app.core.CustType;

import com.app.cust_excs.CustomerHandlingException;

public class CustomerValidations {

	public static SimpleDateFormat sdf;
	static
	{
		 sdf= new SimpleDateFormat("dd-MMM-yyyy");
	}
	
	public static Date validateRegDate(String regDate) throws ParseException
	{
		return sdf.parse(regDate);
	}
	
	public static CustType validateCustType(String type) throws CustomerHandlingException
	{
		try {
			return CustType.valueOf(type.toUpperCase());
		}
		catch(Exception e)
		{
			throw new CustomerHandlingException("No Customer of type - "+type+" found");
		}
	}
}
