package com.onesoftfive;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the person add%");
		int person = s.nextInt();
		if(person > 75){
			System.out.println("He can write exam");
		} else {
			System.out.println("Not able to write exam");
		}
	}
}
