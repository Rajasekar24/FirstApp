package com.questions11;

public class Q01 {
	static int b = 0;

	 void add(int a) {
		b+=a;
	}
	
	public static void main(String[] args) {
		Q01 q =  new Q01();
	q.add(2);
	System.out.println(b);
	q.add(4);
	System.out.println(b);
	}
}
