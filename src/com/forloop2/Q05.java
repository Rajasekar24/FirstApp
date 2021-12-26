package com.forloop2;

public class Q05 {
	public static void main(String[] args) {
		int n = 10, sum = 0;
		for (int i = 1; i <= n; i++) {
			if (sum >= n) {
				System.out.println("The end!!" + sum);
				break;
			}
			sum += i;
		}
	}
}
