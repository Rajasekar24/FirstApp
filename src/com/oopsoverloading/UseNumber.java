package com.oopsoverloading;

public class UseNumber {
//	static int getSquare(int num) {
//		return num * num;
//	}

	int getSquare(int num) {
		return num * num;
	}

	public static void main(String[] args) {
//		int a = 5;
//		System.out.println(a * a);
//
//		System.out.println(getSquare(a));
//
//		 UseNumber un = new UseNumber();
//		System.out.println(un.getSquare(a));

//		Number nu  = new Number();
//		nu.n = 5;
///		nu.getSquare(nu.n);
		
		Number nu  = new Number();
		nu.n = 5;
		Numberutil num = new Numberutil();
		
		int sq = num.getSquare(nu.n);
		
		System.out.println(num.getSquare(sq));
		
		float aa =2.0f;
		System.out.println(num.getSquare(aa));
		
		short aaa =1;
		System.out.println(num.getSquare(aaa));
		
		
		
		
	}
}
