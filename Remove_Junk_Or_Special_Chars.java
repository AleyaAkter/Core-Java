package com.JAVA;

public class Remove_Junk_Or_Special_Chars {

	public static void main(String[] args) {
		String s = "Selenium #@#$$% 1226525 %%%^$$$#";
		
		// we can do it by using regular expression [^a-zA-Z0-9], ^ means replace all except a-zA-Z0-9
		
		s = s.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(s);
		
		
	}

}
