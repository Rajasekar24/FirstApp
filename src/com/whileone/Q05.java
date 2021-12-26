package com.whileone;

import java.util.Scanner;

public class Q05 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		while (true) {
			if (n == 1) {
				break;
			}
			System.out.println(n * n);
			n--;
		}
	}
}
