package com.onesofttwo;

public class Q20 {
	public static void main(String[] args) {
		int grams = 69;
		if ((grams > 50) && (grams < 100)) {
			System.out.println("2 years imprisonment and fine amount is " + (grams * 1000));
		} else if (grams > 100) {
			System.out.println("5 years imprisonment and fine amount is "
					+ (grams * 1000));
		} else if (grams <= 50) {
			System.out.println("fine amount is " + (grams * 1000));
		}
	}
}
