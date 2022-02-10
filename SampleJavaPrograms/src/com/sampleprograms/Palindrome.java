package com.sampleprograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String args[]) {
		System.out.println("enter the number to be checked");
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		int remainder;
		int sum = 0;
		int temp = number;
		
		while(number > 0) {
			
			remainder = number%10;
			sum = (sum * 10)+ remainder;
			number = number/10;
		}
		
		if(temp == sum) {
			System.out.println("Number is palindrome");
		}else {
			System.out.println("not a palindrome");
		}
	}
}
