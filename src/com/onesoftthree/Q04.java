package com.onesoftthree;

public class Q04 {
	public static void main(String[] args) {
		String lang = "Python";

		switch (lang) {
		case "Java": {
			System.out.println("High level language");
			break;
		}
		case "Python": {
			System.out.println("Advanced high level language");
			break;
		}
		case "PHP": {
			System.out.println("High level language");
			break;
		}
		case "Assembly language": {
			System.out.println("Low level language");
			break;
		}
		case "Machine language": {
			System.out.println("Low level language");
			break;
		}
		default: {
			System.out.println("Pls enter vaild input");
		}
		}
	}
}
