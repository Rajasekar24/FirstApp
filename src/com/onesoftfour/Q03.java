package com.onesoftfour;

public class Q03 {
	public static void main(String[] args) {
		int num = 10;
		for (int i = 0; i <= num; i++) {
			System.out.print(i*i);
			if (i != num) {
				System.out.print(",");
			}
		}
	}
}
