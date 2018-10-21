package com.JAVA;

public class Two_Dimentional_Array {

	public static void main(String[] args) {
		int ary[][];
		ary = new int[3][3]; // 3 rows and 3 columns
		ary [0][0]= 2;
		ary [0][1]= 1;
		ary [0][2]= 3;
		ary [1][1]= 5;
		ary [1][2]= 6;
		ary [1][0]= 7;
		
		System.out.println(ary [0][0]);
		System.out.println(ary [1][1]);
		System.out.println(ary [1][2]);
		

	}

}
