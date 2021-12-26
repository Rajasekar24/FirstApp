package com.onesoftfour;

public class Q20 {
	public static void main(String[] args) {
		float arr[] = { 1.1f, 2.2f, 3.3f }, sum = 0.0f, mul = 1.0f;
		for (int i = 0; i < arr.length; i++) {
			mul = ((arr[i]) * (arr[i]));
			sum += mul;
		}
		// System.out.println(sum);
		System.out.println(String.format("%.2f", sum));
	}
}
