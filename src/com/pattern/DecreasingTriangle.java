package com.pattern;

public class DecreasingTriangle {
	void decreasingPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		DecreasingTriangle right = new DecreasingTriangle();
		right.decreasingPattern(5);
	}
}
