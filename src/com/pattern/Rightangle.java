package com.pattern;

public class Rightangle {

	void rightPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Rightangle right = new Rightangle();
		right.rightPattern(5);
	}

}
