package com.sampleprograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter the number to be evaluated");
		Scanner sc = new Scanner(System.in);
		int flag =0;
		
		int number = sc.nextInt();
		
		if(number <= 1) {
			System.out.println("please enter a positive number");
		}else {
			for(int i = 2; i < number ; i++) {
				if(number % i == 0) {
					System.out.println("number is not prime");
					flag = 1;
					break;
				}
			}
			if(flag == 0) {
				System.out.println("number is prime");
			}
		}
	}

}
