package com.forloop3;

public class Q12 {
	public static void main(String[] args) {
		int arr[] = { 2, 1, 10, 5 },val =0;
		for (int i = 0; i < arr.length; i += 2) {
			 val = (int) Math.pow(arr[i], 2) + (int)Math.pow(arr[i+1], 2)- (2* arr[i]* arr[i+1]);
			System.out.println("Squareof ("+ arr[i]+ "-"+ (arr[i+1])+") is " + val );
		}
	}
}
