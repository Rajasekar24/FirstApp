package com.switchone;

import java.util.Scanner;

public class Q19 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String country = s.next();
//		System.out.println(bike);
		switch(country){
		case "India": {
			System.out.println("The Taj Mahal");
			break;
		}
		case "China": {
			System.out.println("The Great Wall of China");
			break;
		}
		case "France": {
			System.out.println("The Eiffel Tower");
			break;
		}
		case "Canada": {
			System.out.println("Niagara Falls");
			break;
		}
		default : {
			System.out.println("Loading!!");
		}
		}
	}
}
