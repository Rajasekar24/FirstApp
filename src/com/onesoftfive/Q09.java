package com.onesoftfive;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length");
		int length = s.nextInt();
		System.out.println("Enter the breadth");
		int breadth = s.nextInt();
		if (length == breadth) {
			System.out.println("Square");
		} else {
			System.out.println("Not square");
		}
	}
}
