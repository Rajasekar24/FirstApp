package com.onesoftfive;

import java.util.Scanner;

public class Q17 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Wings");
		int wings = s.nextInt();
		System.out.println((wings * 250) + "cfm");
	}
}
