package com.whileone;

public class Q09 {
	public static void main(String[] args) {
		int n = 1;
		while (n <= 100) {

			System.out.println(n + (((n == 3) || (n == 2) || (n % 2 == 0) || (n % 3 == 0)) ? "Not  " : "Prime"));

			n++;

		}
	}

}
