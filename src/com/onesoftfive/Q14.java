package com.onesoftfive;

import java.util.Scanner;

public class Q14 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the IQ value");
		float iq = s.nextFloat();
		if (iq == 8.1f) {
			System.out.println("Horse");
		} else if (iq == 8.3f) {
			System.out.println("Cow");
		} else if (iq == 8.8f) {
			System.out.println("Goat");
		}else if (iq == 9.0f) {
			System.out.println("Squirrel");
		} else {
			System.out.println("Loading");
		}
	}
}
