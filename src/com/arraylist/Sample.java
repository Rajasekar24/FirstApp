package com.arraylist;

import java.util.ArrayList;

public class Sample {
	
	public static void main(String[] args) {
		ArrayList<String> li = new ArrayList<String>();
		li.add("A");
		li.add("B");
		li.add("C");
		li.add("D");
		li.add("E");
		li.add("F");
		li.add("G");
		System.out.println(li.size());
		System.out.println(li.indexOf("B"));
		for(int i =0; i<li.size();i++) {
			System.out.println(li.get(i));
		}
		System.out.println("FOR EACH");
		for(String a: li ) {
			System.out.println(a);
		}
		
	}

}
