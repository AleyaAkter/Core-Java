package com.JAVA;

public class Reverse_a_String {

	public static void main(String[] args) {
		
		
		
		// 1. Using For loop
		// we don't have reverse function in String Class.
		// String is immutable
		// immutable objects have no fields that can be changed after the object is created. 
		//A very simple immutable object is a object without any field. And the instance variables are private;
		//Example String
		
		String s = "Selenium";
		int len = s.length();
		String rev = "";
		for (int i = len-1; i >= 0; i--) {
			
			rev = rev+s.charAt(i);
			
			System.out.println(rev);
			
		}
		

		// 2. Using StringBuffer class
		//Mutable objects have fields that can be changed, 
		StringBuffer str= new StringBuffer(s);
		System.out.println(str.reverse());
		
	
		String s2 = "Python";
		int len2 = s2.length();
		
		
		System.out.println(len2);
		
		String reserve = "";
		
		
		for(int i = len2-1; i>=0; i-- ) {
			
			reserve = reserve + s2.charAt(i);
						
		}
		System.out.println(reserve);
		
		
		
		

	}
	
	
	
	
	

}


