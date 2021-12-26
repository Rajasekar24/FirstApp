package com.forloop3;

public class Q11 {
public static void main(String[] args){
	int arr[] = {0,10,100,123,12,43,40}, temp;
	
	for(int a: arr){
		temp = a%10 == 0 ? (a/10) : ((a/10) +1);
		System.out.println("multiple of 10 value is"+ temp +"0");
	}
	
}
}
