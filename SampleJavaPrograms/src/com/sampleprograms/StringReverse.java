package com.sampleprograms;

public class StringReverse {

	public static void main(String[] args) {
		 String originalString = "hello from the other side";
		 
		 String reversedString = "";
		 
		 
		 for(int i = originalString.length()-1 ; i >= 0; i--) {
			 reversedString = reversedString + originalString.charAt(i);
		 }
		 
		 System.out.println(originalString);
		 System.out.println(reversedString);

	}

}
