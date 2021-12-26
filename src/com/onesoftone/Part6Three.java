package com.onesoftone;

public class Part6Three {
	public static void main(String[] args) {
		int age = 100;
		String citizen = "Indian";

		if ((age > 0) && (citizen != "")) {
			if ((age > 18) && (citizen == "Indian")) {
				System.out.println("Eligible to driving license");
			} else {
				System.out.println("Not eligible to driving license");
			}
		} else {
			System.out.println("Pls enter vaild Data");
		}
	}

}
