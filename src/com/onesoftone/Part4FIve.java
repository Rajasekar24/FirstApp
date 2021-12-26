package com.onesoftone;

public class Part4FIve {
	public static void main(String[] args) {
		int num = 100;
		if ((num >= 0) && (num <= 100)) {
			if ((num > 90) && (num <= 100)) {
				System.out.println(num + " is First class");
			} else if ((num > 80) && (num <= 90)) {
				System.out.println(num + " is Second class");
			} else if ((num > 70) && (num <= 80)) {
				System.out.println(num + " is Third class");
			} else if ((num > 50) && (num <= 70)) {
				System.out.println(num + " is pass");
			} else {
				System.out.println(num + " is Fail");
			}
		} else {
			System.out.println("enter vaild mark");
		}
	}
}
