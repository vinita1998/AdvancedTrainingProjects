package com.java.training;

import java.util.ArrayList;

public class AddStudentNames {
	public static void main(String[] args) {
		ArrayList<String> alist=new ArrayList<String>();
	    alist.add("Sharanya"); 
	    alist.add("Vini");  
	    alist.add("Sai");  
	    alist.add("Avnish");
	    alist.add("Shiv");
	    alist.add("Lokesh");
	    System.out.println(alist);
	    
	    if (alist.contains("Sharanya"))
	        System.out.println("Sharanya exists in the ArrayList");

	    else
	        System.out.println("Sharanya does not exist in the ArrayList");

	    if (alist.contains("Sai"))
	        System.out.println("Vini exists in the ArrayList");

	    else
	        System.out.println("Vini does not exist in the ArrayList");
	    
	}

}
