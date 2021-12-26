package com.onesoftfour;

public class Q04 {
	public static void main(String[] args) {
		int num = 10;
		for (int i = 0; i <= num; i++) {
			System.out.print((2*i)+1);
			if (i != num) {
				System.out.print(",");
			}
		}
	}
}
