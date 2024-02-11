package com.method.overriding;

public class Tiger extends Animal {
	String tigersound="TigerSound";
	//overriding the method based on child requirement
	
	void makesound()
	{
		System.out.println("Tiger is making"+tigersound);
		
	}
	void accessParentmethod()
	{
		//super keyword is using for calling the parent methods
		super.makesound();
	}

}
