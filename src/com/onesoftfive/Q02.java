package com.onesoftfive;

import java.util.Scanner;

public class Q02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the age:");
		int age = s.nextInt(), cost = 100;
		if (age >= 60) {
			System.out.println("Price :" + (cost - 10));
		} else if (age < 18) {
			System.out.println("Price :" + (cost - 20));
		} else {
			System.out.println("Price :" + (cost - 5));
		}
	}
}
