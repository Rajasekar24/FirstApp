package com.switchone;

import java.util.Scanner;

public class Q18 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String bike = s.nextLine();
		switch(bike){
		case "royal enfield bullet 350": {
			System.out.println("346cc and Rs.1,21,583");
			break;
		}
		case "yamaha yzf r15 v3": {
			System.out.println("155cc and Rs.1,45,300");
			break;
		}
		case "ktm 200 duke": {
			System.out.println("199.5cc and Rs.1,72,749");
			break;
		}
		case "royal enfield himalayan": {
			System.out.println("411cc and Rs.2,10,576");
			break;
		}
		default : {
			System.out.println("Ask help!!");
		}
		}
	}
}
