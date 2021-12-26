package com.onesoftfive;

import java.util.Scanner;

public class Q12 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the time in railway time");
		int time = s.nextInt();
		if ((time > 6) && (time < 11)) {
			System.out.println("Good Morning");
		} else if ((time >= 11) && (time < 15)) {
			System.out.println("Good after noon");
		} else if ((time >= 15) && (time < 18)) {
			System.out.println("Good evening");
		} else {
			System.out.println("Good night");
		}
	}
}
