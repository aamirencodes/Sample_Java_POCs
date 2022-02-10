package com.sampleprograms;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		String providedString = "hello";
		String newString = removeDuplicate(providedString);
		System.out.println(newString);

	}
	
	public static String removeDuplicate(String s) {
		
		String newString = "";
		
		for(int i=0; i<s.length(); i++) {
			
			char c = s.charAt(i);
			if(newString.indexOf(c) == -1) {
				newString = newString + c;
			}
		}
		
		return newString;
	}

}
