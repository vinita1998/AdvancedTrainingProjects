package com.java.training;
import java.util.*;

public class Even {

	   public static void main(String []args)

	   {
		   int n=0,i=0;
           Scanner sc = new Scanner(System.in);
            System.out.print("Enter the value of n : ");

	       n = sc.nextInt();

	       for(i=1; i<n; i++)

	       {
              if(i%2==0)
            	System.out.print(i+" ");
	              

	       }    

	       System.out.println();

	         

	   }

	}

