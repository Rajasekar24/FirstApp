package com.onesoftfour;

public class Q19 {
	public static void main(String[] args) {

		float a[] = { 1.10f, 2.20f, 3.30f }, count = 0;

		for (int i = 0; i < a.length; i++) {
			count += ((a[i] * 100) % 100) / 100;
		}
		 System.out.println(count);
	}
}
