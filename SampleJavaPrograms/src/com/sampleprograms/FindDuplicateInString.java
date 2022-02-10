package com.sampleprograms;

public class FindDuplicateInString {

	public static void main(String[] args) {

		String input = "beautiful";
		char[] chars = input.toCharArray();

		for (int i = 0; i < input.length(); i++) {
			for (int j = i + 1; j < input.length(); j++) {

				if (chars[i] == chars[j]) {
					System.out.print(chars[j] + " ");
					break;
				}
			}
		}

	}

}
