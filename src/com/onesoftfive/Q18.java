package com.onesoftfive;

import java.util.Scanner;

public class Q18 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the railway time");
		float time = s.nextFloat();
		if ((time >= 6.00f) && (time <= 8.00f)) {
			System.out.println("Breakfast");
		} else if ((time >= 11.00f) && (time <= 13.30f)) {
			System.out.println("Lunch");
		} else if ((time >= 19.00f) && (time <= 22.00f)) {
			System.out.println("Dinner");
		} else {
			System.out.println("Closed");
		}

	}
}
