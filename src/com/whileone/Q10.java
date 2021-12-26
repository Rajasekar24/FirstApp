package com.whileone;

import java.util.Scanner;


//const isEmpty = (value) =>
//value === undefined ||
//value === null ||
//(typeof value === "object" && Object.keys(value).length === 0) ||
//(typeof value === "string" && value.trim().length === 0);


public class Q10 {
	static boolean isEmpty(String a) {
		return (a == null)? true : false;
		
	}
	static boolean isEmpty(int[] a) {
		return (a == null)? true : false;
		
	}
	
	public static void main(String[] args) {
		int i = 1;
		int[] arr; 
//		do {
//			System.out.println(i);
//			i++;
//		} while (i == 10);
	}

//	public static void main(String[] args) {
////		Scanner s = new Scanner(System.in);
//
////		int i = Integer.parseInt(null, 0, 0, 0);
//		int num = Integer.parseInt("2");
//
//		System.out.println(num % 2 == 0 ? (num % 5 == 0) ? "even 5 div" : "even 5 not div"
//				: (num % 4 == 0) ? "odd 4 div" : "odd 4 not div");
//
//		switch (num) {
//		case 5: {
//			System.out.println("ss");
//			break;
//		}
//		
//		default:
//			throw new IllegalArgumentException("Unexpected value: " + num);
//		}
//	}
}
