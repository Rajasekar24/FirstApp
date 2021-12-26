package com.onesoftfour;

public class Q09 {
	public static void main(String[] args) {
		int num = 7, mul = 1;
		for (int i = num; i < (num + 5); i++) {
			mul *= i;
		}
		System.out.print(mul);
	}
}
