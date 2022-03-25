package com.java.training;
import java.util.*;
public class Rectangle {
	
	  double breadth,length,area;

	  

	  Scanner sc=new Scanner(System.in);

	   Rectangle()

	   {  

	   System.out.print("Enter the length: ");

	   length=sc.nextDouble();

	   System.out.print("Enter the breadth: ");

	   breadth=sc.nextDouble(); 

	  

	    area=length*breadth;

	    System.out.println("Area of Rectangle: "+area);

	   }

	}

	
	

