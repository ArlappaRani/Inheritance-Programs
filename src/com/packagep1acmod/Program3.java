package com.packagep1acmod;

public class Program3 {
	
	//creating the object for calling the non static method
	Program1 p1=new Program1();
	 void diaplay3()
     {
    	 System.out.println(p1.a);
    	 System.out.println(p1.b);
    	 System.out.println(p1.c);
    	// System.out.println(p1.d); not access private in different class
     }
	
	

}
