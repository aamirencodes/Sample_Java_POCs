package com.test.poc;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {

	public static void main(String[] args) {
		
		List<String> myList = new ArrayList<String>();
		myList.add("a");
		myList.add("b");
		
		ListIterator<String> l = myList.listIterator();
		while(l.hasNext()) {
			System.out.println(l.next());
			l.previous();
		}

	}

}
