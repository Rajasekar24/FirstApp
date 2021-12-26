package com.onesofttwo;

import java.util.Scanner;

public class Q17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num < 6) {
			System.out.println("Child");
		} else if ((num > 6) && (num < 10)) {
			System.out.println("Adult");
		} else if (num > 10) {
			System.out.println("Abult and taller");
		} else {
			System.out.println("Pls enter vaild size");
		}
	}
}
