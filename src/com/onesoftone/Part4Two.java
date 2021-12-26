package com.onesoftone;

public class Part4Two {
	public static void main(String[] args) {
		int a = 1;

		if ((a % 2 == 0) && (a % 3 == 0)) {
			System.out.println("Both two and three divisible");
		} else if ((a % 5 == 0) && (a % 3 == 0)) {
			System.out.println("Both three and five divisible");
		} else if (a % 2 == 0) {
			System.out.println("Two divisible");
		} else if (a % 3 == 0) {
			System.out.println("Three divisible");
		} else if (a % 5 == 0) {
			System.out.println("Five divisible");
		} else {
			System.out.println("Try some other number");
		}
	}
}
