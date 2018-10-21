package com.JAVA;

import java.awt.List;
import java.util.HashSet;
import java.util.Set;
import java.util.jar.Attributes.Name;

public class Swap_two_integers_withoutUsing_tempVariable {

	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		
//		x = x-y;
//		y = x+y;
//		
		int t;
		t = x;
	    x = y;
		y = t;
		
		
		System.out.println(x);
		System.out.println(y);
		
		String s1 = new String("Selenium");
		String s2 = new String("java");
		s2 = new String("Selenium");
		System.out.println(s2==s2);
		System.out.println(s1.equals(s2));
		
		Name n1 = new Name("Aliya");
		Name n2 = new Name("Akter");
		n2 = new Name("Ove");
		
		System.out.println(n2);
		System.out.println(n1);
		
		System.gc();
		
		
		// How to get duplicate value
		String ar[]= {"JAVA", "Selenium","Ruby", "Python", "JAVA", "Ruby"};
		Set<String> store = new HashSet<String>();
		for(String name1 : ar) {
			if (store.add(name1)==false) {
				System.out.println("duplicate value is=====>" + name1);
				
			}
		}
		
		for (int i = 0; i < ar.length; i++) {
			
			for (int j = i+1; j < ar.length; j++) {
				
				if (ar[i].equals(ar[j])) {
					System.out.println("Duplicate value is:::: " + ar[i]);
					
				}
				
			}
			
		}
		
		
		
		
		int ary[][];
		ary = new int[3][3];
		ary [0][0]= 2;
		ary [0][1]= 1;
		ary [0][2]= 3;
		ary [1][1]= 5;
		ary [1][2]= 6;
		ary [1][0]= 7;
		
		System.out.println(ary [0][0]);
		
		
		
		
		
		
		



	}

}
