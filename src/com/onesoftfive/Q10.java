package com.onesoftfive;

import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the person 1 age");
		int person1 = s.nextInt();
		System.out.println("Enter the person 2 age");
		int person2 = s.nextInt();
		System.out.println("Enter the person 3 age");
		int person3 = s.nextInt();

		if ((person1 == person2) && (person1 == person3)) {
			System.out.println("Three people are same age");
		} else {
			if ((person1 > person2) && (person1 > person3)) {
				System.out.println("person1 elder");
			}
			if ((person1 < person2) && (person1 < person3)) {
				System.out.println("person1 younger");
			}

			if ((person2 > person1) && (person2 > person3)) {
				System.out.println("person2 elder");
			}
			if ((person2 < person1) && (person2 < person3)) {
				System.out.println("person2 younger");
			}

			if ((person3 > person2) && (person3 > person1)) {
				System.out.println("person3 elder");
			}
			if ((person3 < person2) && (person3 < person1)) {
				System.out.println("person3 younger");
			}
			if ((person1 == person2) || (person1 == person3)
					|| (person2 == person3)) {
				System.out.println("Two person age same");
			}
		}
	}
}
