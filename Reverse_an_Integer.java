package com.JAVA;

public class Reverse_an_Integer {

	public static void main(String[] args) {
		
		
		// by using algo
		int num = 123456;
		int rev = 0;
		
		while(num !=0){
			rev = rev * 10 + num % 10;
			num = num / 10;
			}
		
		System.out.println(rev);
		
		// Using StringBuffer class
		
		int num2 = 123456;
		
		StringBuffer revrs = new StringBuffer(String.valueOf(num2));
		System.out.println(revrs.reverse());
		
		int num3 = 123456;
		System.out.println(new StringBuffer(String.valueOf(num3)).reverse());
		
		
		
		int num4 = 87654321;
		
		int reserve = 0;
		
		while(num4 !=0) {
			
			reserve = reserve*10 + num4 % 10;
			
			num4 = num4/10;
			
			
			
		}
		
		System.out.println(reserve);
		
		int num5 = 12121212;
		System.out.println(new StringBuffer(String.valueOf(num5)).reverse());
		
		
		
		

	}

}
