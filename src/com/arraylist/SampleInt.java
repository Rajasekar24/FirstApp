package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class SampleInt {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(9);
		al.add(10);
		System.out.println(al.size());
		System.out.println(al.indexOf(5));

		Iterator<Integer> iter = al.iterator();

		System.out.println("Iter");
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}

//		System.out.println("FOR");
//		for (Integer a : al) {
//			System.out.println(a);
//		}
	}
}
