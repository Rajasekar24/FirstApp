package com.onesoftone;

public class Part5One {
	public static void main(String[] args) {
		int age = 69;

		if (age >= 1) {
			if ((age < 10)) {
				System.out.println("Kid");
			} else if ((age > 13) && (age <= 20)) {
				System.out.println("Teenage");
			} else if ((age > 25) && (age <= 50)) {
				System.out.println("Adult");
			} else if ((age > 50) && (age <= 100)) {
				System.out.println("Old age");
			} else {
				System.out.println("Uncategorized");
			}
		} else {
			System.out.println("Enter a vaild Age");
		}
	}

}
