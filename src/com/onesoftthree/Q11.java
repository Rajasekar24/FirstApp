package com.onesoftthree;

public class Q11 {
	public static void main(String[] args) {
		boolean val = false;
		char ch='a';
		System.out.println((char)ch);
		 String vals = val ? "true": "false";
		 System.out.println(vals.charAt(0));
		switch(vals){
		case "true" : {
			System.out.println("False");
			break;
		}
		case "false": {
			System.out.println("True");
			break;
		}
		default: {
			System.out.println("enter vaild inputs");
		}
		}
	}
}
