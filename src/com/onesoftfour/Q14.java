package com.onesoftfour;

public class Q14 {
	public static void main(String[] args) {
		String x = "madam";// get string value
		// Change to string array
		String a[] = x.split("");
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if ((a[i].equalsIgnoreCase("a")) || (a[i].equalsIgnoreCase("e"))
					|| (a[i].equalsIgnoreCase("i"))
					|| a[i].equalsIgnoreCase("u") || a[i].equalsIgnoreCase("o")) {
				count++;
			}
		}
		System.out.println(count);
	}
}

