package com.onesoftfour;

public class Q02 {
	public static void main(String[] args) {
		int num = 10;
		for (int i = num; i >= 0; i--) {
			System.out.print(i);
			if (i != 0) {
				System.out.print(",");
			}
		}
	}
}
