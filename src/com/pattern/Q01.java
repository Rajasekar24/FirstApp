package com.pattern;

public class Q01 {
	public static void main(String args[]) {
		int x = Integer.parseInt("5"), sum = 0;
		// double c = Double.parseDouble("5");
		// int b = Integer.parseInt("444",16);

//		for (int i = 1; i <= 5; i++) {
//			sum *= i;
//		}

		for (int i = 1; i <= x; i++) {
			sum -= i;
		}
		
		System.out.println(sum);
		// System.out.println(c);
		// System.out.println(b);
	}
}
