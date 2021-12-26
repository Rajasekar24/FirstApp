package com.arraylist;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class UseTest3 {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "r");
		hm.put(2, "A");
		hm.put(3, "s");
		

		for (Map.Entry<Integer, String> e : hm.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
		
		hm.forEach((k,v) -> System.out.println(k+" "+ v));

		Iterator<Entry<Integer,String>> i = hm.entrySet().iterator();
		while (i.hasNext()) {
			Map.Entry<Integer,String> e = (Entry<Integer, String>) i.next();
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}
}
