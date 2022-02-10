package com.test.poc;

public class StringInternTest {

	public static void main(String[] args) {
		
		
		String s = "abc";
		String s1 = new String("abc").intern();
		String s2 = new String("abc");
		
		System.out.println(s == s1);
		
		System.out.println(s == s2);
		
		System.out.println(s1 == s2);

	}

}
