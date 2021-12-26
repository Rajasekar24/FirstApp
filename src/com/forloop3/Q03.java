package com.forloop3;

public class Q03 {
	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int c[][] = new int[arr.length][arr[0].length];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				c[i][j] = arr[i][j] * 3;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.println(c[i][j]);
			}
		}

	}
}
