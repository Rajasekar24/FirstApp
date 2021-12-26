package com.oopsexmpale;

public class Calculater {

	public void add(int a, int b){
		System.out.println(a+b);
	}
	
	public void add(int a, int b,int c){
		System.out.println(a+b+c);
	}
	
	
	public static void main(String[ ] args){
		Calculater cc = new Calculater();
		cc.add(10,20);
		cc.add(1, 2, 3);
	}
}
