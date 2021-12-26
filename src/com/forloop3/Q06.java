package com.forloop3;

public class Q06 {
	public static void main(String[] args) {

		int arr[][] = { { 2, 3, 5 }, { 7, 9, 20 }, { 35, 1, 12 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = arr[0].length - 1; j >= 0; j--) {
				System.out.println(arr[i][j]);
			}
		}
	}
}
