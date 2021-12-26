package com.onesoftthree;

public class Q13 {
	public static void main(String[] args) {
		String person = "Principale";

		switch (person) {
		case "Principal": {
			System.out
					.println("Principal room, Staff room, Class room, Exam hall");
			break;
		}
		case "Staff": {
			System.out.println("Staff room, Class room, Exam hall");
			break;
		}
		case "Student": {
			System.out.println("Class room, Exam hall");
			break;
		}
		default: {
			System.out.println("Others not allowd");
		}
		}
	}
}
