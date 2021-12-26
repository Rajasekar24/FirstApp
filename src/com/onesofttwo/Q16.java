package com.onesofttwo;

import java.util.Scanner;

public class Q16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num % 2 == 0) {
			if (num % 4 == 0) {
				System.out.println("Number is EVEN and divisible by 4");
			} else {
				System.out.println("Number is EVEN and not divisible by 4");
			}
		} else {
			if (num % 5 == 0) {
				System.out.println("Number is ODD and divisible by 5");
			} else {
				System.out.println("Number is ODD and not divisible by 5");
			}
		}

	}
}
