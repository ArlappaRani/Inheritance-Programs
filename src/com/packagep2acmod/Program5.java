package com.packagep2acmod;
import com.packagep1acmod.Program1;
public class Program5 {
	//creating the object for calling the non static 
         Program1 p1=new Program1();
		 void diaplay3()
	     {
	    	 System.out.println(p1.a);
	    	 //System.out.println(p1.b);Not access protected in parent class of different package
	    	 //System.out.println(p1.c);Not access default in different package
	    	// System.out.println(p1.d);Not access private in different class
	     }
		
		

}
