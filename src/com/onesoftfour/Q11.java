package com.onesoftfour;

public class Q11 {
	public static void main(String[] args) {
		int num = 4, mul = 1, sum = 0;
		for (int i = 1; i <= num; i++) {
			mul = i * i * i;
			sum += mul;
		}
		System.out.print(sum);
	}
}
