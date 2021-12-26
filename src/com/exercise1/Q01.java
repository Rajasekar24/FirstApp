package com.exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Q01 {
	public static boolean isPrime(int val) {
		if (val < 2)
			return false;

		for (int i = 2, max = (int) Math.sqrt(val); i <= max; i++)
			if (val % i == 0)
				return false;

		return true;
	}

	public static void main(String[] args) {

		int a = 5;
		System.out.println(a++);

		ArrayList<Integer> li = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
		li.add(5);
		li.add(6);
		li.add(7);
		li.add(8);

		System.out.println("FOR EACH");
		for (Integer aa : li) {
			System.out.println(aa);
		}
		System.out.println("Using While");
		Iterator<Integer> ii = li.iterator();
		while (ii.hasNext()) {

			System.out.println(ii.next());
		}

		int countodd = 0, counteven = 0, sum = 0;

		for (int i = 0; i < li.size(); i++) {
			sum += li.get(i);
			if (li.get(i) % 2 == 0) {
				System.out.println(
						li.get(i) + " is Even and " + (!isPrime(li.get(i)) ? "Not a Prime number" : "Prime number"));
				counteven++;
			} else {
				countodd++;
				System.out.println(
						li.get(i) + " is Odd and " + (!isPrime(li.get(i)) ? "Not a Prime number" : "Prime number"));
			}
			System.out.println(
					counteven + " is Even numbers, " + countodd + " is Odd numbers, and " + sum + " is total ");

			// for(int i = 0; i < li.size() ; i++){
//			boolean temp = false;
//			for (int j = 2; j < li.get(i); j++) {
//				if (li.get(i) % j == 0) {
//					temp = true;
//					break;
//				}
//			}
//			if (!isPrime(li.get(i))) {
//				System.out.println("not a prime " + li.get(i));
//			} else {
//				System.out.println("Prime " + li.get(i));
//			}

		}
	}

}
