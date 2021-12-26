package com.onesoftfour;

public class Q10 {
	public static void main(String[] args) {
		int num = 3, mul = 1, sum = 0;
		for (int i = 1; i <= num; i++) {
			mul = i * i;
			sum += mul;
		}
		System.out.print(sum);
	}
}
