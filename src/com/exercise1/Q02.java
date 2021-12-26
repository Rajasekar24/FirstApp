package com.exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Q02 {

	public static void main(String[] args) {
		ArrayList<String> li = new ArrayList<String>(Arrays.asList("aaa", "bbb", "Zccc", "ddqweqwed", "eee", "q"));
		li.add("FFF");
		int k = 0, small = li.get(0).length(), large = 0;
		for (String s : li) {
			if (s.length() > large) {
				large = s.length();
			}
			if (s.length() < small) {
				small = s.length();
			}
			for (int i = 0; i < s.length(); i++) {
//				System.out.println(( )? "Vowels": "Not Vowels");
				String a = s.substring(i, i + 1);
				k++;
				if ((a.equalsIgnoreCase("a")) || (a.equalsIgnoreCase("e")) || (a.equalsIgnoreCase("i"))
						|| (a.equalsIgnoreCase("o")) || (a.equalsIgnoreCase("u"))) {
					System.out.print(a + " Vowels ");
				} else {
					System.out.print(a + " Not Vowels ");
				}
			}
			if (s.equals(s.toUpperCase())) {
				System.out.println(s + " UpperCase");
			} else if (s.equals(s.toLowerCase())) {
				System.out.println(s + " LowerCase");
			} else {
				System.out.println(s + " Mixed case");
			}
		}
		System.out.println(large + " Large, small " + small);
		System.out.println("K " + k);

	}
}
