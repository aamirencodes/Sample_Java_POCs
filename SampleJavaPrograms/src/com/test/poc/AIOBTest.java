package com.test.poc;

public class AIOBTest {

	public static void main(String[] args) {
		
		try {
			int[] a = new int[5];
			a[5] = 1;
			System.out.println(a[5]);
		}catch(Exception e) {
			System.out.println("Exception caught");
		}catch(ArrayIndexOutOfBoundsException aiob) {
			System.out.println("AIOB exception caught");
		}
		
	}

}
