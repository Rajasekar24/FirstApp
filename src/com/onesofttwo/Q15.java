package com.onesofttwo;

import java.util.Scanner;

public class Q15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String val = sc.next();

		if (val.matches("[a-z A-Z]")) {

			if ((val.equalsIgnoreCase("a")) || (val.equalsIgnoreCase("e"))
					|| (val.equalsIgnoreCase("i"))
					|| (val.equalsIgnoreCase("o"))
					|| (val.equalsIgnoreCase("u"))) {
				System.out.println("vowel");

			} else {
				System.out.println("not vowel");
			}
		} else {
			System.out.println("Not an alphabet at all");
		}
	}
}
// aeiou

// val == "a"