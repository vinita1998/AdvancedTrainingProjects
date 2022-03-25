package com.java.training;

public class IntegerArray {
	 public static void main(String[] args) {  
	          
	        int [] arr = new int [] {3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, };  
	        int sum = 0;  
	       
	        for (int i = 0; i < arr.length; i++) {  
	           sum = sum + arr[i];  
	        }  
	        System.out.println("Sum of all the elements of an array: " + sum);  
	    }  

}
