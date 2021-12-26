package com.onesoftfour;

public class Q21 {
	public static void main(String[] args) {
		long num = 12346l, val, rem;
		int len = String.valueOf(num).length();

		for (int i = 0; i < len; i++) {
			val = num % 10;
			rem = num / 10;
			num = rem;
			 if (val % 2 == 0) {
			 System.out.println(val + "is EVEN");
			 } else {
			 System.out.println(val + "is ODD");
			 }

		}
	}
}
