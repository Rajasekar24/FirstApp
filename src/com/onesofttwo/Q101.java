package com.onesofttwo;

import java.util.Scanner;

public class Q101 {

	public static int AScore = 0, BScore = 0, ATeam = 7, BTeam = 7, currentVal,
			teamChangeScore = 5;
	final static int maxPoint = 30;
	static boolean currentTeam = true;

	public void resetTeam() {
		BTeam = ATeam = 7;
		System.out.println("Team Changed");
	}

	public void print() {
		System.out.println("A score " + AScore + " A Team " + ATeam
				+ " and b score " + BScore + " B Team " + BTeam);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Q101 q = new Q101();
		while (true) {
			if (AScore >= maxPoint) {
				System.out.println("A Team win");
				break;
			} else if (BScore >= maxPoint) {
				System.out.println("B Team win");
				break;
			}
			if (currentTeam) {
				// A TEAM
				System.out.println("Enter the score for A");
				currentVal = sc.nextInt(); // (1,0,-1)
				if ((currentVal == -1) || (currentVal == 0)
						|| (currentVal == 1)) {
					if (currentVal == -1) {
						if (ATeam == 1) {
							q.resetTeam();
							BScore += teamChangeScore + 1;
							currentTeam = false;
						} else {
							BScore++;
							ATeam--;
							currentTeam = false;
						}

					} else if (currentVal == 1) {
						if (BTeam <= 1) {
							q.resetTeam();
							AScore += teamChangeScore + 1;
							currentTeam = false;
						} else {
							AScore++;
							BTeam--;
							currentTeam = false;
						}
					} else if (currentVal == 0) {
						currentTeam = false;
					}
					q.print();
				} else {
					System.out.println("Pls enter vaild value");
				}

			} else {
				// B TEAM
				System.out.println("Enter the score for B");
				currentVal = sc.nextInt(); // (1,0,-1)
				if ((currentVal == -1) || (currentVal == 0)
						|| (currentVal == 1)) {
					if (currentVal == -1) {
						if (BTeam == 1) {
							q.resetTeam();
							AScore += teamChangeScore + 1;
							currentTeam = true;
						} else {
							AScore++;
							BTeam--;
							currentTeam = true;
						}

					} else if (currentVal == 1) {
						if (ATeam <= 1) {
							q.resetTeam();
							BScore += teamChangeScore + 1;
							currentTeam = true;
						} else {
							BScore++;
							ATeam--;
							currentTeam = true;
						}
					} else if (currentVal == 0) {
						currentTeam = true;
					}
					q.print();
				} else {
					System.out.println("Pls enter vaild value");
				}

			}
		}
	}
}
