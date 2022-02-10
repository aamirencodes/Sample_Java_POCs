package com.streams;

import java.util.Arrays;
import java.util.List;

public class FindEvenNumbers {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10, 12, 9, 8,56, 77, 24);
		myList.stream().filter(n -> n%2 == 0).forEach(System.out::println);
	}
}
