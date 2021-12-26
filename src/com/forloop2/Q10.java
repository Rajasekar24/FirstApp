package com.forloop2;

public class Q10 {
	public static void main(String[] args) {
		int n = 8, sum = 0;
		for (int i = 1; i <= n; i++) {
			if ((i % 5) == 0) {
//				System.out.println("rr" + i);
				continue;
			}
//			System.out.println(i*i);
			sum += i*i;
		}
		System.out.println(sum);
	}
}
