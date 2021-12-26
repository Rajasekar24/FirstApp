package com.forloop2;

public class Q12 {
	public static void main(String[] args) {
		long a = 1234567l;
		int l = String.valueOf(a).length();

		long e = 0;
		long o = 0;
		long d = 0;
		for (int i = 0; i < l; i++) {

		long c = a % 10;
		long b = a / 10;
		a = b;

		if (c % 5 == 0) {
		continue;
		}

		if (c % 2 == 0) {
		e = e + c * c;
		} else {

		o = o + c * c * c;
		}

		}

		d = e + o-2;
		System.out.println(d);
	}
}
