package com.forloop3;

import java.util.Scanner;

public class Q08 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value to find in the array:");
		String val = s.next();
		int count = 0;
		int arr[] = { 23741927, 24124242, 879678 };

		for (int a : arr) {
			count = 0;
			String[] q = String.valueOf(a).split("");
			for (String w : q) {
				if (w.equals(val)) {
					count++;
				}
			}
			System.out.println("Total count for " + a + " in " + val + " is "
					+ count + " times");
		}
	}
}
