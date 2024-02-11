package com.constructoroverload.note2;

public class JavaTeacher extends Teacher {
	String subject="JAVA";
	void doingPro()
	{
		System.out.println("Java teacher doing "+subject+"project");
	}
	public JavaTeacher(String subject)
	{
		this.subject=subject;
	}
	public JavaTeacher()
	{
		
	}
	

}
