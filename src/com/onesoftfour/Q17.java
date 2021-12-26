package com.onesoftfour;

public class Q17 {
	public static void main(String[] args) {
		String x = "onesoft230";// get string value
		// Change to string array
		String a[] = x.split("");
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (!(a[i].matches("[\\d]"))) {
				count++;
			}
		}
		System.out.println(count);
	}
}
