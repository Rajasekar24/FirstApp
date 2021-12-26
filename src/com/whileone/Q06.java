package com.whileone;

public class Q06 {
	public static void main(String[] args) {
		int year = 2022;

		while (year >= 1980) {

			System.out.println(year + ((year % 4 == 0) ? " LEAP YEAR" : " NORMAL YEAR"));
			year--;
		}
	}
}
