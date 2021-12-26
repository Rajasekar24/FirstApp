package com.forloop2;

public class Q08 {
	public static void main(String[] args) {
		String in = "onesoft tech";
		char val;
		int sum = 0;
		for (int i = 0; i < in.length(); i++) {
			val = in.charAt(i);
			if (val == ' ') {
				continue;
			}
			sum++;
		}
		System.out.println("The end!!" + sum);
	}
}
