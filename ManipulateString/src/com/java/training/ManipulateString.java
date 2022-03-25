package com.java.training;

public class ManipulateString {
	public static void main(String[] args) {
		
		
		String txt= "JAVA is Simple";
		
		System.out.println(txt.toUpperCase()); 
		
		System.out.println(txt.toLowerCase());
		
		
		String[] words=txt.split("\\s");	
		for(String w:words){  
			System.out.print(w.charAt(0)); 
			System.out.print(" ");
		}
		System.out.println(" ");
		
		
		String[] words1=txt.split("\\s");  
		for(String w:words1){  
			System.out.println(w); 
		}
		
		
		StringBuilder words2= new StringBuilder("JAVA is Simple");
		
		Object words21;
		System.out.println("String = " + words2.toString());
		StringBuilder reverseStr = words2.reverse();
		System.out.println("Reverse String = " + reverseStr.toString());
		
		//Total Length
		System.out.println("length of string " + txt.length());
	}

}
