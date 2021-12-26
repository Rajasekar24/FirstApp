package com.collectionsWatch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UseWatch {



	public static void main(String[] args) {
//		private int id;
//		private boolean isdigital, isesim, isspeaker, ismic, isbluetooth, stopwatch, ishealthcare, showDate;
		Feature f1 = new Feature(1, false, false, false, false, false, true, false, true);
		Feature f3 = new Feature(3, false, false, false, false, false, true, false, true);
		Feature f2 = new Feature(2, true, true, true, true, true, true, false, true);
		Feature f4 = new Feature(4, true, true, true, true, true, true, true, true);
		Feature f5 = new Feature(5, true, true, true, true, true, true, true, true);

//	Watch(String brand, String model, String color, int hands, int buttons, float size, boolean isBattery,
//			boolean isRechagreble, boolean isWaterProof, Feature[] fea)
		Watch w1 = new Watch("CASIO", "AX-99", "Silver", 6, 3, 20.2f, true, false, true, f1);
		Watch w2 = new Watch("Mi", "fit-band5", "Black", 0, 1, 17.7f, true, true, true, f3);

		LinkedList<Watch> ll = new LinkedList<Watch>(Arrays.asList(w1, w2));
		ll.add(new Watch("Mi", "Smart-watc001h", "BLack", 3, 2, 15.0f, true, true, true, f2));
		ll.add(new Watch("SAMSUNG", "Smart-watc3", "BLack", 5, 2, 43.0f, true, true, true, f4));
		ll.add(new Watch("SAMSUNG", "Smart-watc4", "BLack", 0, 2, 43.0f, true, true, true, f5));

		// ADD LinkedList to HAshMap
		HashMap<Integer, Watch> hm = new HashMap<Integer, Watch>();
		int k = 0;
		for (Watch w : ll) {
			hm.put(k++, w);
		}

		System.out.println("====FOR ENC====");
		for (Watch w : ll) {
			System.out.println(w);
		}

		System.out.println("====FOR====");
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}

		System.out.println("====Iteror====");
		Iterator<Watch> ill = ll.iterator();
		while (ill.hasNext()) {
			System.out.println(ill.next());
		}

		System.out.println("====FOR ENC MAP====");
		for (Map.Entry<Integer, Watch> w : hm.entrySet()) {
			System.out.println(w.getKey() + " " + w.getValue());
		}
		System.out.println("====for MAP====");
		for (int i = 0; i < hm.size(); i++) {
			System.out.println(hm.get(i));
		}

		System.out.println("====Iterator====");

		Iterator<Entry<Integer, Watch>> hmll = hm.entrySet().iterator();
		while (hmll.hasNext()) {
			Map.Entry<Integer, Watch> e = (Entry<Integer, Watch>) hmll.next();
			System.out.println(e.getKey() + " " + e.getValue());
		}

		HashSet<Watch> s = new HashSet<Watch>();
		for (Map.Entry<Integer, Watch> w : hm.entrySet()) {
			s.add(w.getValue());
		}

		System.out.println("====SET====");
		for (Watch w : s) {
			System.out.println(w);
		}


//		li1.stream().filter(x -> x%2==0).forEach(System.out::println);

//		List<Integer> li2=li1.stream().filter(x -> x%2==0).collect(Collectors.toList());
		List<Integer> li1 = new ArrayList<>(Arrays.asList(10, 23, 35, 40, 50));
		System.out.println(li1);
		List<Integer> li2 = li1.stream().map(x -> x * 2).collect(Collectors.toList());
		System.out.println(li2);

//		ll.stream().filter(x-> x.getHands() > 0).forEach(System.out::println);
//		List<Watch> li3 = ll.stream().filter(x-> x.getHands() > 0).collect(Collectors.toList());
//		System.out.println(li3);
//		HashMap<String,Watch> hm1=(HashMap<String, Watch>) ll.stream().filter(x-> x.getHands() > 0).collect(Collectors.toMap(Watch::getModel, Function.identity()));
//		System.out.println(hm1);
//		Random r = new Random();
//		System.out.println(r.nextInt());
//		System.out.println(r.nextInt());
//		System.out.println(r.nextInt());
//		System.out.println(r.nextInt());
//		System.out.println(r.hashCode());
//		int low = 10;
//		int high = 100;
//		Integer result = r.nextInt(high-low) + low;
//		System.out.println(Ran.RandNum());
		
		
//		HashMap<Integer, Integer> hm2 = (HashMap<Integer,Integer>) li1.stream().collect(Collectors.toMap(Function.identity(), Function.identity()));
// 		System.out.println(hm2);

	}
}
