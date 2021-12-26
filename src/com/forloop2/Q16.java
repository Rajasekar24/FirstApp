package com.forloop2;

public class Q16 {
	public static void main(String[] args) {
		int num = 16, sum = 0;
		for (int i = 1; i <= num; i += 5) {
			// System.out.println(i);
			sum += i*i*i;
		}
		System.out.println(sum);
	}
}
