package com.onesoftfour;

public class Q00 {
	int a = 1, b = 2;

	public Q00() {

	}

	public Q00(int a, int b) {
		this.a = a;
		this.b = b;
	}

	void add() {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		Q00 q1 = new Q00(10, 20);
		Q00 q2 = new Q00();
		
		q1.add();
		q1.a = 100;
		q1.b = 200;
		q1.add();

		q2.add();
		q2.a = 50;
		q2.b = 70;
		q2.add();
	}
}
