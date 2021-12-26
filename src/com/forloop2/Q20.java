package com.forloop2;

public class Q20 {
	public static void main(String[] args) {
		int a, n;
		a = n = 5;
		for (int i = 1; i <= n; i++) {
			for (int x = n; x > i; x--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (int i = (a - 1); i >= 1; i--) {
			for (int j = i; j <= (a - 1); j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
