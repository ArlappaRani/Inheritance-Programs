package com.typesofmethods.inheritance;

public class ShapeApp {

	public static void main(String[] args) {
		// creating the child class object
       Circle cr=new Circle();
       //invoking the inherited method
       cr.draw();
       //invoking the over ridden method
       System.out.println(cr.calculateArea());
       //invoking the child specific method
       System.out.println(cr.calculatePerimeter());
	}

}
