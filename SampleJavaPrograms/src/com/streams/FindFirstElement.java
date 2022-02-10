package com.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindFirstElement {

	public static void main(String[] args) {
		
		List<Integer> myList = Arrays.asList(10, 12, 8, 79, 881, 4);
		
		myList.stream().findFirst().ifPresent(System.out::println);
		
		//Count the elements
		long count = myList.stream().count();
		System.out.println(count);
		
		//Find maximum value in list
		int max = myList.stream().max(Integer::compare).get();
		System.out.println(max);
		
		//Sort values in ascending order
		myList.stream().sorted().forEach(System.out::println);
		
		//Sort values in descending order
		myList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	}

}
