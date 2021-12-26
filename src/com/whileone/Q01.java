package com.whileone;

public class Q01 {

	public static void main(String[] args) {
		long num = 75638692l;
		int count =1;
		while (true) {
			if (String.valueOf(num).length() == 1) {
				break;
			}
			num  = num /10; 
			count++;
		}
		System.out.println(count);
	}

}
