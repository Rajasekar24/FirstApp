package com.forloop2;

public class Q02 {
public static void main(String[] args){
	long num = 123456l, val, rem;
	int len = String.valueOf(num).length(), count = 0;

	for (int i = 0; i < len; i++) {
		val = num % 10;
		rem = num / 10;
		num = rem;
		 if (!(val % 2 == 0)) {
		 count++;
		 }
//		count = !(val % 2 == 0) ? count++ : count;
	}
	System.out.println(count);
}
}
