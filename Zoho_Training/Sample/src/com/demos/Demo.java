//$Id$
package com.demos;

import java.util.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d = new Date();
		long time = d.getTime();
		 time = time + 86400000l;
		long ct = time  + 86400000l;
		Date ed = new Date(ct);
		System.out.println(ed);
		
		
		
		try
		{
			int a=0,b=0;
			a=b/1;	
			Stack s = new Stack();	
			System.out.println(a);
		}
		catch(Exception e)
		{
			callExceptions(e);
		}
		
	}
	
	public static void callExceptions(Exception e)
	{
		if(e.getClass().equals(ArithmeticException.class))
		{
			throw new ArithmeticException("Please don't give 0 as second number");
		}
		if(e.getClass().equals(Exception.class))
		{
			throw new RuntimeException();
		}
	}
	
	

}
