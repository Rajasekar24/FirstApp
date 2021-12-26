package com.onesoftone;

public class Part2Two {
	public static void main(String[] args) {
		int alreadyPoints = 20, currentPoints = 11;

		if ((alreadyPoints + currentPoints) % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}
}
