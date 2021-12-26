package com.onesoftthree;

public class Q14 {
	public static void main(String[] args) {
		String person = "Customer";

		switch (person) {
		case "Bank manager": {
			System.out
					.println("Arrang meeting, Check accounts, Collect loan documents, Withdraw money");
			break;
		}
		case "Accountant": {
			System.out
					.println("Check accounts, Collect loan documents, Withdraw money");
			break;
		}
		case "Staff": {
			System.out.println("Collect loan documents, Withdraw money");
			break;
		}
		case "Customer": {
			System.out.println("Withdraw money");
			break;
		}
		default: {
			System.out.println("Others not allowd");
		}
		}
	}
}
