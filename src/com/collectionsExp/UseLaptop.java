package com.collectionsExp;

import java.util.ArrayList;
import java.util.Collections;

public class UseLaptop {
	public static void main(String[] args) {
		ArrayList<Laptop> li = new ArrayList<Laptop>();
		li.add(new Laptop(1, 8, "a"));
		li.add(new Laptop(2, 4, "B"));
		li.add(new Laptop(3, 16, "c"));
		li.add(new Laptop(0, 4, "D"));

		System.out.println("Original List");
		System.out.println(li);
//		Collections.sort(li);
		// System.out.println(li);
//		NameComparater nameComparater = new NameComparater();
//		SizeComparator ss = new SizeComparator();

		Collections.sort(li, new NameComparater());
		System.out.println("Name Comparator List");
		System.out.println(li);
//		Collections.sort(li, new SizeComparator());
//		System.out.println("Size Comparator List");
//		System.out.println(li);
//		System.out.println("test foreach");
		li.forEach(x -> System.out.println(x));

	}
}
