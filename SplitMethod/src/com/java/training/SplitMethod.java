package com.java.training;

public class SplitMethod {
	public static void main(String[] args) {
		
		
		String input= (" 23  +  45  -  (  343  /  12  ) ");
		String[] m=input.split("\\\s");
		
		for(String m1:m){  
			System.out.println(m1); 
			
		}
	}

}
