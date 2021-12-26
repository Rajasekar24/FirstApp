package com.arraylist;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class ListToSet {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>(Arrays.asList("A", "S", "D", "F", "G", "A"));
		HashSet<String> s1 = new HashSet<>(ll);
		HashSet<String> s2 = new HashSet<>();

		for (int i = 0; i < ll.size(); i++) {
			s2.add(ll.get(i));
		}

		System.out.println(s1);
		System.out.println(s2);
		

	}
}
