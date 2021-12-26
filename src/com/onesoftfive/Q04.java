package com.onesoftfive;

import java.util.Scanner;

public class Q04 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the grams");
		int grams = s.nextInt();
		if ((grams > 50) && (grams < 100)) {
			System.out.println("2 years imprisonment and fine amount is "
					+ (grams * 1000));
		} else if (grams > 100) {
			System.out.println("5 years imprisonment and fine amount is "
					+ (grams * 1000));
		} else if (grams <= 50) {
			System.out.println("fine amount is " + (grams * 1000));
		}
	}
}
