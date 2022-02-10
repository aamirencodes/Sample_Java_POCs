package com.test.poc;

public class TryCatchTest {

	public static void main(String[] args) {
		try {
			return;
		} catch (Exception e) {
			return;
		} finally {
			System.out.println("hello from the other side");
		}
	}
}
