package com.onesoftthree;

public class Q03 {
	public static void main(String[] args) {
		String title = "Drrr";

		switch (title) {
		case "Mr": {
			System.out.println("Male");
			break;
		}
		case "Ms": {
			System.out.println("Unmarried");
			break;
		}
		case "Mrs": {
			System.out.println("Married");
			break;
		}
		case "Dr": {
			System.out.println("Doctor");
			break;
		}
		default: {
			System.out.println("Loading");
		}
		}
	}
}
