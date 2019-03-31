package com.general;

public class RecursionFactorial {

	public static void main(String[] args) {
		Integer num = 5;
		System.out.println(recursionFactorial(num));
	}

	private static int recursionFactorial(Integer num) {
		if(num==0) {
			return 1;
		}	
		
		return (num*recursionFactorial(num-1));
	}

}
