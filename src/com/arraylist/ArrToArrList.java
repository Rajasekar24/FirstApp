package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrToArrList {
	static Integer[] convertAutoBoxing(int[] a) {
		Integer[] newArr = new Integer[a.length];
		int q = 0;
		for (int aa : a) {
			newArr[q] = a[q];
			q++;
		}
//		for (int i = 0; i < a.length; i++) {
//			newArr[i] = a[i];
//		}

		return newArr;

	}

	public static void main(String[] args) {
		int[] iarr = { 1, 2, 3, 4, 5, 6, 7, 8 };

		ArrayList<Integer> aaa = new ArrayList<Integer>(Arrays.asList(convertAutoBoxing(iarr)));

//		aaa.forEach();;
		for (Integer p : aaa) {
			System.out.println(p);
		}

	}
//	public static void main(String[] args) {
//		String[] arr = { "A", "B", "C", "D" };
//		int[] iarr = { 1, 2, 3, 4, 5, 6, 7, 8 };
//		ArrayList<String> aa = new ArrayList<String>(Arrays.asList("AA","BB","CC"));
//
////		ArrayList<Integer> aaa = new ArrayList<Integer>();
////		Collections.addAll(aaa, iarr);
////
//////		List<String> list = Arrays.asList(arr);
//		for (String a : aa) {
//			System.out.println(a);
//		}
//
//	}
}
