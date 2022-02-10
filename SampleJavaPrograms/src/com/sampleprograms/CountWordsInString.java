package com.sampleprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountWordsInString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string");
		String word = sc.nextLine();
		
		System.out.println("entered word is::"+word);
		
		Map<String, Integer> countMap = new HashMap<>();
		
		String arr[] = word.split(" ");
		
		for(int i = 0; i<arr.length; i++) {
			
		}
	}

}
