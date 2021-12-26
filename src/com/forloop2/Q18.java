package com.forloop2;

public class Q18 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for(int x =n;x>i;x--){
				System.out.print(" ");
			}
			for(int j =1; j<=i;j++){				
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
