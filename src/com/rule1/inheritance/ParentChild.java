package com.rule1.inheritance;

public class ParentChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		System.out.println(c.x);
		//System.out.println(c.y);error
		c.displayX();
		//c.displayY()error
		
		

	}

}
