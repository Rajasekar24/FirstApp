package com.forloop2;

public class Q09 {
	public static void main(String[] args) {
		int n = 10;
		for (int i = 1; i <= n; i++) {
			if ((i % 4) == 0) {
				// System.out.println("The end!!" + sum);
				continue;
			}
			System.out.print(i + ", ");
		}
	}
}
