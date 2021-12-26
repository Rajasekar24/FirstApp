package com.onesoftfive;

import java.util.Scanner;

public class Q16 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Status");
		String light = s.next();
		System.out.println("THE LIGHT IS " + (light.equalsIgnoreCase("ON") ? "ON" : "OFF"));
	}
}
