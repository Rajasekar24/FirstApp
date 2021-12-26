package com.onesoftthree;

public class Q08 {
	public static void main(String[] args) {
		int number = 1000000;

		switch (number) {
		case 100: {
			System.out.println("Hundred");
			break;
		}
		case 1000: {
			System.out.println("1000");
			break;
		}
		case 10000: {
			System.out.println("Ten thousand");
			break;
		}
		case 100000: {
			System.out.println("100000");
			break;
		}
		default: {
			System.out.println("Loading");
		}
		}
	}
}
