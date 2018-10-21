package com.JAVA;

import java.util.HashSet;
import java.util.Set;

public class How_To_get_Duolicate_Value {

	public static void main(String[] args) {
		// How to get duplicate value
				String ar[]= {"JAVA", "Selenium","Ruby", "Python", "JAVA", "Ruby"};
				Set<String> store = new HashSet<String>();
				for(String name1 : ar) {
					if (store.add(name1)==false) {
						System.out.println("duplicate value is=====>" + name1);
						
					}
				}
				
		// Secound case
				for (int i = 0; i < ar.length; i++) {
					
					for (int j = i+1; j < ar.length; j++) {
						
						if (ar[i].equals(ar[j])) {
							System.out.println("Duplicate value is:::: " + ar[i]);
							
						}
						
					}
					
				}

	}

}
