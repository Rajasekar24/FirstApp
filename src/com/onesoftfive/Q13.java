package com.onesoftfive;

import java.util.Scanner;

public class Q13 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the time in mins");
		int mins = s.nextInt();
		System.out.println( String.format("%.2f", (mins* 0.1666666666666667))+" kg per month");
//		if(mins == 30){
//			System.out.println("5 kg per month");
//		} else if (mins == 60) {
//			System.out.println("10 kg per month");
//		} else {
//			System.out.println( (mins* 0.1666666666666667)+" kg per month");
//		}
	}
}
