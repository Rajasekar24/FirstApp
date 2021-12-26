package com.onesoftfive;

import java.util.Scanner;

public class Q08 {
	void check(int val) {
		if ((val > 50)) {
			System.out.println(val * val);
		} else {
			System.out.println(val * val * val);
		}
	}

	public static void main(String[] args) {
		Q08 q = new Q08();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number1");
		int person1 = s.nextInt();
		System.out.println("Enter the number2");
		int person2 = s.nextInt();
		q.check(person1);
		q.check(person2);
	}
}
