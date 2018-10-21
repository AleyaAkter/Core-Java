package com.JAVA;

import java.util.Arrays;

public class Largest_Smallest_NumbersINarray {

	public static void main(String[] args) {
		int numbers[]= {10,25,50,-30,87,220,60,5657};
		
		int largest = numbers[0];
		int smallest = numbers[0];
		
		for(int i=1; i<numbers.length; i++) {
			if(numbers[i]>largest) {
				largest=numbers[i];
				
			}
			else if(numbers[i]<smallest){
				smallest=numbers[i];
			}
		}
		
		System.out.println("Given Array is====>"+ Arrays.toString(numbers));
		System.out.println("\n largest number is====>"+ largest+"\n smallest number is ====>"+ smallest);
		

	}
	
	

}
