package com.java.training;

import java.util.Arrays;

public class SmallestValue {
	public static int getSmallest(int[] a, int total){  
		Arrays.sort(a);  
		return a[0];  
		}  
		public static void main(String args[]){  
	 
		int a[]={3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, };
		
			
		System.out.println("Smallest: "+getSmallest(a,17));  
		}

}
