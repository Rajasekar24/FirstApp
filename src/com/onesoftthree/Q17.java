package com.onesoftthree;

public class Q17 {
	public static void main(String[] args) {
		String days = "Friday";

		switch (days) {
		case "Sunday": {
			System.out.println("1,2,3,4,5,6,7");
			break;
		}
		case "Monday": {
			System.out.println("2,3,4,5,6,7");
			break;
		}
		case "Tuesday": {
			System.out.println("3,4,5,6,7");
			break;
		}
		case "Wedesday": {
			System.out.println("4,5,6,7");
			break;
		}
		case "Thurday": {
			System.out.println("5,6,7");
			break;
		}
		case "Friday": {
			System.out.println("6,7");
			break;
		}
		case "Saturday": {
			System.out.println("7");
			break;
		}
		default: {
			System.out.println("Invaild");
		}
		}
	}
}
