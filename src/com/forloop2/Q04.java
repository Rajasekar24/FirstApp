package com.forloop2;

public class Q04 {
	public static void main(String[] args) {
		int n = 2, sum = 0;
		for (int i = 1;; i++) {
			if (sum >= (3*n)) {
				System.out.println("The end!!" + sum);
				break;
			}
			sum += i;
		}
	}
}
