package com.typesofmethods.inheritance;

public class Circle extends Shape {
	//override method
	double radius=0.5;
	double calculateArea()
	{
		return Math.PI*radius*radius;
	}
	
	//child specific method only it present child class
	double calculatePerimeter()
	{
		return 2*Math.PI*radius;
	}

}
