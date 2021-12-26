package com.onesoftone;

public class Part4Four {
	public static void main(String[] args) {
		int num = 10000;
		if (num > 0) {
			if (num >= 1000) {
				System.out.println(num + " is above thousand");
			} else if (num >= 100) {
				System.out.println(num + " is below thousand");
			} else {
				System.out.println(num + " is below hundred");
			}
		}
	}
}
