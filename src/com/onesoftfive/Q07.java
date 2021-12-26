package com.onesoftfive;

import java.util.Scanner;

public class Q07 {

	void physicalTest(int val) {
		if (val >= 157) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}

	public static void main(String[] args) {
		Q07 q = new Q07();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the person 1 Height");
		int person1 = s.nextInt();
		System.out.println("Enter the person 2 Height");
		int person2 = s.nextInt();
		System.out.println("Enter the person 3 Height");
		int person3 = s.nextInt();
		q.physicalTest(person1);
		q.physicalTest(person2);
		q.physicalTest(person3);
	}
}
