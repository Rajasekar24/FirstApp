package com.onesoftone;

public class Part4Six {
	public static void main(String[] args) {
		String language = "java", s1 = "python";
//		(language.equals(s1)) ? System.out.println("y"):System.out.println("N");
		if (language == s1) {
			System.out.println("Y");
		} else {
			System.out.println("N");
		}
		
		if (language != "") {
			if (language == "java") {
				System.out.println("High level language");
			} else if (language == "microprocessor 8080") {
				System.out.println("Low level language");
			} else if (language == "python") {
				System.out.println("Advanced High language");
			} else {
				System.out.println("Checking");
			}
		} else {
			System.out.println("Pls enter a vaild language");
		}
	}
}
