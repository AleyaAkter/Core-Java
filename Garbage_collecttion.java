package com.JAVA;

import java.util.jar.Attributes.Name;

public class Garbage_collecttion {

	public static void main(String[] args) {
		
		Name n1 = new Name("Dog");
		Name n2 = new Name("Cat");
		n2 = new Name("Cow");
		
		System.out.println(n1);
		System.out.println(n2);
		
		// In this case if you print n2 it will print "Cow" and Previous one will be eligible for gaebage collection.
		
		
		System.gc();
		
		
		

	}

}
