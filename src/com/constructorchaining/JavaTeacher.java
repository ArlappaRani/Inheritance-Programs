package com.constructorchaining;

public class JavaTeacher extends Teacher {
	String ClassName;
	public JavaTeacher()
	{
		//super() method is used for sending the control
	//	from child class to parent class
		
		super("Kodnest");
		System.out.println("Java Teacher 0 parameterized");
	}
	public JavaTeacher(String ClassName)
	{
		//this method used for send the control from one constructor to another
		//inside the same class
		this();
		this.ClassName=ClassName;
	    System.out.println("Java Teacher 1 parameterized");
	}
	void display()
	{
		System.out.println("CollegeName"+collegeName);
		System.out.println("class name"+ClassName);
		
		
	}

}
