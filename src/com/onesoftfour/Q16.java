package com.onesoftfour;

public class Q16 {
	public static void main(String[] args) {
		String x = "I like to sing a song";// get string value
		// Change to string array
		String a[] = x.split("");
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i].equalsIgnoreCase(" ")){
				count ++;
			}
		}
		System.out.println(count);
	}
}
