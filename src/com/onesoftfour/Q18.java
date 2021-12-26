package com.onesoftfour;

public class Q18 {
	public static void main(String[] args) {
		String x = "OnESoft";// get string value
		// Change to string array
		String a[] = x.split("");
		int count = 0;
		// System.out.println(x.length());
		for (int i = 0; i < a.length; i++) {
			if (!(a[i].matches("[A-Z]"))) {
				count++;
			}
		}
		System.out.println(count);
	}
}
