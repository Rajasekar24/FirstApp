package com.forloop3;

public class Q07 {
	public static void main(String[] args) {

		int arr[][] = { { 2, 3, 5 }, { 7, 9, 20 }, { 35, 1, 12 } };

		// for (int i = 0; i < arr.length; i++) {
		for (int i = (arr.length - 1); i >= 0; i--) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
}
