package com.general;

public class ReverseNumber {

	public static void main(String[] args) {
		Integer num = 12345;
		reverseNumber(num);
	}

	private static void reverseNumber(Integer num) {
		int rev = 0;
		while (num != 0) {
			rev = rev * 10;
			rev = rev + num % 10;
			num = num / 10;
		}
		System.out.println(rev);
	}

}
