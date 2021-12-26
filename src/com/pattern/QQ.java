package com.pattern;

public class QQ {
	public static void main(String[] args) {

		int a, b, c;
		a = 20;
		b = 40;
		c = 1;
		System.out.printf("A=%d  B=%b  C=%d \n",a,b,c);
//		System.out.prin
		     
//			20   40   20   1
		if (a >= b && a >= c) {
			   
			if (b >= c) {
		
				System.out.println("(SOP1) 2nd largest number is " + b);
			} else {
				System.out.println("(SOP2) 2nd largest number is " + c);
			}
//			      40    20   20   1
		} else if (b >= a && b >= c) {
//			    20   1
			if (a >= c) {
				System.out.println("(SOP3) 2nd largest number is " + a);
			} else {
				System.out.println("(SOP4) 2nd largest number is " + c);
			}
		}

		// c is the largest number of the three
		else if (a >= b) {
			System.out.println("(SOP5) 2nd largest number is " + a);
		} else {
			System.out.println("(SOP6) 2nd largest number is " + b);
		}
	}
}
