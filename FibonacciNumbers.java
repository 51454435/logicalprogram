package com.general;

public class FibonacciNumbers {
	public static void main(String[] args) {
		Integer n = 5;
		fibonacciNumbers(n);
	}

	private static void fibonacciNumbers(Integer n) {
		int a = 0, b=0, c=1;
		for (int i = 0; i < n; i++) {
			a = b;
			b = c;
			c = a+b;
			System.out.print(a+" ");
		}
	}
}
