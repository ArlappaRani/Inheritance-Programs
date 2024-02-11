package com.finalvariable;

public class Child extends Parent{

	int y=20;
	void change()
	{
		//x=90;it is final variable we cant change the value
       y=99;//we can change or modify 
       //bcz it is not final variable
	}
	void display()
	{
	 System.out.println("Updated value x"+x);//10
	 System.out.println("Updated value y"+y);//99
	}
}
