package com.forloop2;

public class Q17 {
	public static void main(String[] args) {
		int num = 7, sum = 1;
		for (int i = 1; i <= num; i += 3) {
//			 System.out.println(i);
			sum *= i;
		}
		System.out.println(sum);
	}
}
