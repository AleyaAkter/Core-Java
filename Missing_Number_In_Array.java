package com.JAVA;

public class Missing_Number_In_Array {

	public static void main(String[] args) {
		
		
		//// 1st case
		int a[] = {1,2,3,4,6,7,8,9,10};
		
		int sum1 = 0;
		for(int i=0; i<a.length; i++) {
			sum1 = sum1 + a[i];
			
		}
		System.out.println(sum1);
		
		
		int sum2 = 0;
		for(int j = 1; j<=10; j++) {
			sum2 = sum2 + j;
					
		}
		System.out.println(sum2);
		
		System.out.println("Missing number is::====>"+ (sum2-sum1));

		
		////// secound case
		int ar[]= {10,11,12,13,14,16,17,18,19,20};
		int sum3 = 0;
		
		for(int i=0; i<ar.length; i++) {
			sum3 = sum3 + ar[i];
						
		}
		
		System.out.println(sum3);
		
		int sum4 =0;
		for(int j=10; j<=20; j++ ){
			sum4 = sum4 +j;
		}
				
		System.out.println(sum4);
		System.out.println("Missing value is::====>" +(sum4-sum3));
		
		
		
		
		int array[]= {5,6,7,8,9,11,12};
		
		int sum5 =0;
		
		for(int i = 0; i< array.length; i++ ) {
			
			sum5 = sum5+array[i];
				
		}
		System.out.println(sum5);
		
		int sum6 = 0;
		for(int j=5; j<=12; j++ ) {
			sum6= sum6+j;
			
			
		}
		System.out.println(sum6);
		System.out.println(sum6-sum5);
		
		
		
		
		
		
	}

}
