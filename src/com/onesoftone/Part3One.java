package com.onesoftone;

public class Part3One {

	public static void main(String[] args) {
		int a = 100, b = 200, c = 30;

		if ((a > b) && (a > c)) {
			System.out.println("A is bigger");
		} else if ((b > c) && (b > a)) {
			System.out.println("B is bigger");
		} else {
			System.out.println("c is bigger");
		}
	}
}
