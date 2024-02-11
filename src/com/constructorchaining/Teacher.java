package com.constructorchaining;

public class Teacher {
	String collegeName;
	public Teacher()
	{
		System.out.println("Teacher 0 parameterized constuctorr");
		
	}
	public Teacher(String collegeName)
	{
		this();
		this.collegeName=collegeName;
		System.out.println("Teacher one parametarized ");
	}

}
