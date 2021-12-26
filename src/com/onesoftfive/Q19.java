package com.onesoftfive;

import java.util.Scanner;

public class Q19 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the units");
		int units = s.nextInt(), price = 0;

		if (units <= 100) {
			System.out.println("No charge");
		} else if ((units > 100) && (units < 200)) {
			price = (units - 100) * 5;
		}
		if ((units >= 200)) {
			units -= 100; // no charge
			if (units > 100) {
				units -= 100;
				price += 500;
				price += units * 10;
			} else {
				price = units * 5;
			}
		}
		System.out.println(price + " Price");
	}
}
