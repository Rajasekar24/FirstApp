package com.onesoftfive;

import java.util.Scanner;

public class Q05 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("If 'false' mean spoil and if 'true' is mean good");
		System.out.println("Enter the person 1 status as (true or false)");
		boolean person1 = s.nextBoolean();
		System.out.println("Enter the person 2 status as (true or false)");
		boolean person2 = s.nextBoolean();
		System.out.println("Enter the person 3 status as (true or false)");
		boolean person3 = s.nextBoolean();
		System.out.println("Enter the person 4 status as (true or false)");
		boolean person4 = s.nextBoolean();
		if (person1 && person2 && person3 && person4 ) {
			System.out.println("Good work");
		} else {
			System.out.println("Spoiled");
		}
	}
}
