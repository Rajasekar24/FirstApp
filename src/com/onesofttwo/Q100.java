package com.onesofttwo;

import java.util.Scanner;

public class Q100 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int runs = 0, balls = 0, chances = 3, score;
		while (true) {
			System.out.println("Enter the run");
			score = sc.nextInt();
			if (score == 0) {
				if (chances == 1) {
					System.out.println("Your RUN " + runs
							+ " and number of balls " + balls);
					System.out.println("OUT!!!");
					break;
				} else {
					balls++;
					chances--;
					System.out.println("Your RUN " + runs
							+ " and number of balls " + balls);
					System.out.println("You have " + chances + " chances");
				}

			} else if (score == 1) {
				// score 1
				balls++;
				runs++;
				chances = 3;
				System.out.println("Your RUN " + runs + " and number of balls "
						+ balls);
			} else {
				System.out.println("Pls enter (0||1)");
			}

		}
	}
}
