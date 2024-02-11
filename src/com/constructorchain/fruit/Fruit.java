package com.constructorchain.fruit;

public class Fruit {
	String color;
	public Fruit()
	{
		//using this method to passing the value to
		//single parameterized constructor 
		this("pink");
		System.out.println("Zero parameterized");
	}
	public Fruit(String color)
	{
		//this keyword is used for solving showdoing problem
		this.color=color;
	    System.out.println("one parameterized constructor");	
	}

}
