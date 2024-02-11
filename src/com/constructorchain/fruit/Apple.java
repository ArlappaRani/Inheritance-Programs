package com.constructorchain.fruit;

public class Apple extends Fruit{
	int cost;
	
	public Apple()
	{
		this(345);
		System.out.println("o-parmeterized constructor");
	}
	public Apple(int cost)
	{
		this.cost=cost;
		System.out.println("1-pameterized constructor");
		color="green";
	}
	public Apple(int cost,String color)
	{
		this();
		this.cost=cost;
		this.color=color;
		System.out.println("2-pameterized constructor");
		
	}
	
	
	void display()
	{
		System.out.println("color:"+color);
		System.out.println("cost:"+cost);
	}

}
