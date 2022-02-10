package com.streams;

import java.util.Arrays;
import java.util.List;

public class FindNumbersStartingWithSpecificDigit {

	public static void main(String[] args) {
		
		List<Integer> myList = Arrays.asList(10, 12, 22, 17, 67, 87);
		myList.stream().map(s -> s + "").filter(s -> s.startsWith("1")).forEach(System.out::println);

	}

}
