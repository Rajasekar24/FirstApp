package com.forloop2;

public class Q077 {
	public static void main(String[] args) {
		float val = 27.3975f;
		for (;;) {
			val = val * 10;
			if (val % 1 == 0) {
				System.out.println("The end!!" + (int) (val));
				break;
			}
		}
	}
}
