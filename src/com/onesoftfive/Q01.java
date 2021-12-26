package com.onesoftfive;

import java.util.Scanner;

public class Q01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int age = s.nextInt();
		if (age < 6) {
			System.out.println("child");
		} else if ((age > 6) && (age < 10)) {
			System.out.println("Adult");
		} else if (age > 10) {
			System.out.println("adult and taller");
		}
	}
}
