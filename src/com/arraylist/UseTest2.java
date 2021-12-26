package com.arraylist;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Random;

public class UseTest2 {
	public static void main(String[] args) {
//		HashSet<GlassFeatures> gl = new HashSet<GlassFeatures>(Arrays.asList(new GlassFeatures(0, "Tesst")));
//		TreeSet<GlassFeatures> gl = new TreeSet<GlassFeatures>(Arrays.asList(new GlassFeatures(0, "Tesst")));
		LinkedHashSet<GlassFeatures> gl = new LinkedHashSet<GlassFeatures>(Arrays.asList(new GlassFeatures(0, "Tesst")));
		Random r=new Random();
		int no = r.nextInt();
		System.out.println(no);
		GlassFeatures gg = new GlassFeatures(3, "BLue Lens");
		GlassFeatures gg1 = new GlassFeatures(3, "BLue Lens");

		gl.add(new GlassFeatures(1, "Dual Color"));
		gl.add(new GlassFeatures(2, "PH color"));
		gl.add(gg);
		gl.add(gg1);
		gg.setFeature("change");


		for (GlassFeatures f : gl) {
			System.out.println("ID:" + f.getId());
			System.out.println("Features:" + f.getFeature());
		}
		
		String s = "abc";
		System.out.println(reverse(s));
		
		
	}
	static String reverse(String s) { 
		   if(s.length() == 0) 
		     return ""; 
		   return s.charAt(s.length() - 1) + reverse(s.substring(0,s.length()-1)); 
		 } 
}
