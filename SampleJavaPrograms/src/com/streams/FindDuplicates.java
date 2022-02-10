package com.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

public class FindDuplicates {

	public static void main(String[] args) {
		
		List<Integer> myList = Arrays.asList(12, 68, 99, 212, 12, 15, 19, 68);
		Set<Integer> mySet = new HashSet();
		
		myList.stream().filter(n -> !mySet.add(n)).forEach(System.out::println);
	}

}
