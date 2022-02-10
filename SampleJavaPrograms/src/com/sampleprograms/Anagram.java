package com.sampleprograms;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "Silent";
		String s2 = "Liswten";
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		if(s1.length() != s2.length()) {
			System.out.println("Strings are not anagram");
		}
		else {
			char[] string1 = s1.toCharArray();
			char[] string2 = s2.toCharArray();
			
			Arrays.sort(string1);
			Arrays.sort(string2);
			
			if(Arrays.equals(string1, string2)) {
				System.out.println("Strings are anagram");
			}else {
				System.out.println("Strings are not anagram");
			}
		}
		

	}

}
