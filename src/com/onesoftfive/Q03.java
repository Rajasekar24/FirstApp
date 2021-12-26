package com.onesoftfive;

import java.util.Scanner;

public class Q03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the sqft:");
		int sqft = s.nextInt();
		if (sqft <= 180) {
			System.out.println("1 Ton");
		} else if (sqft <= 450) {
			System.out.println("2 Ton");
		} else {
			System.out.println("Pls meet the manger");
		}
	}
}
