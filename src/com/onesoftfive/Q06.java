package com.onesoftfive;

import java.util.Scanner;

public class Q06 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the person 1 status as (0 to 100)");
		int person1 = s.nextInt();
		System.out.println("Enter the person 2 status as (0 to 100)");
		int person2 = s.nextInt();
		System.out.println("Enter the person 3 status as (0 to 100)");
		int person3 = s.nextInt();
		System.out.println("Enter the person 4 status as (0 to 100)");
		int person4 = s.nextInt();
		System.out.println("Enter the person 5 status as (0 to 100)");
		int person5 = s.nextInt();
		System.out.println("Enter the person 6 status as (0 to 100)");
		int person6 = s.nextInt();
		System.out.println("Enter the person 7 status as (0 to 100)");
		int person7 = s.nextInt();
		System.out.println("Enter the person 8 status as (0 to 100)");
		int person8 = s.nextInt();
		System.out.println("Enter the person 9 status as (0 to 100)");
		int person9 = s.nextInt();
		System.out.println("Enter the person 10 status as (0 to 100)");
		int person10 = s.nextInt();

		if ((person1 > 50) && (person2 > 50) && (person3 > 50)
				&& (person4 > 50) && (person5 > 50) && (person6 > 50)
				&& (person7 > 50) && (person8 > 50) && (person9 > 50)
				&& (person10 > 50)) {
			System.out.println("Everyone Passed");
		} else {
			System.out.println("Close permanently");
		}
	}
}
