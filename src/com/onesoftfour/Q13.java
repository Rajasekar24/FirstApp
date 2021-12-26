package com.onesoftfour;

public class Q13 {
	public static void main(String[] args) {
		int num = 10, sum = 0;
		for (int i = 0; i <= num; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.print(sum);

	}
}
