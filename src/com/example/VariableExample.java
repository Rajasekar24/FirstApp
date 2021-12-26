package com.example;


public class VariableExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main");
//		int a= 00;
		Variable v = new Variable();
//		v.a = 20;
		v.user1();
		v.user2();
		v.user3();
		
		Variable v1 = new Variable();
		v1.user1();
//		v1.b = 30;
		v1.user2();
		
		Variable v2 = new Variable();
		v2.user1();
		v2.user2();
		
	}

}

class Variable {
	int a =10;
	static int b = 20;
	 void user1() {
		System.out.println(a);
	}
	 void user2(){
		 System.out.println(b);
	 }
	 void user3(){
		int c =15;
		System.out.println(c);
	 } 
}

