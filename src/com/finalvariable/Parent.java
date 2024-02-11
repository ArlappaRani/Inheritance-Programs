package com.finalvariable;

public class Parent {
	
	final int x=10;
	
	void change()
	{
	   // x=55; here the final variable can
		//not be modified or changed
		
	}
	void diaplay()
	{
		System.out.println("The value of x:"+x);
	}

}
