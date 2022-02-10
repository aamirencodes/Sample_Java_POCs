package com.sampleprograms;

import java.util.Scanner;

public class NumberSwapping {

	public static void main(String[] args) {
		
		System.out.println("enter value of x and y");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println("Numbers before swapping are x = "+ x + " and y = " + y);
		
		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println("Numbers after swapping are x = "+ x + " and y = " + y);

	}

}
