package com.onesofttwo;

import java.util.Scanner;

public class Q18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(), currentPrice = 100, discount;
		if (num >= 60) {
			discount = 10;
			System.out.println("Price to pay : " + (currentPrice - discount));
		} else if (num < 18) {
			discount = 20;
			System.out.println("Price to pay : " + (currentPrice - discount));
		} else {
			discount = 5;
			System.out.println("Price to pay : " + (currentPrice - discount));
		}
	}
}
