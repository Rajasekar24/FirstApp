package com.forloop2;

public class Q11 {
	public static void main(String[] args) {
		int n = 8, sum = 0;
		for (int i = 1; i <= n; i++) {
			// System.out.println("i :" + i);
			if (!(i % 2 == 0)) {
				// System.out.println("rr" + i);
				continue;
			}
			// System.out.println("cube" + (i * i * i));
			sum += i * i * i;
		}
		System.out.println(sum);
	}
}
