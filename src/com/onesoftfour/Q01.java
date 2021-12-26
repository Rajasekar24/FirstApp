package com.onesoftfour;

public class Q01 {
	public static void main(String[] args) {
		int num = 10;
		for (int i = 0; i <= num; i++) {
			System.out.print(i);
			if (i != num) {
				System.out.print(",");
			}
		}
	}
}
