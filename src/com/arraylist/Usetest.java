package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class Usetest {
	public static void main(String[] args) {
//		ArrayList<GlassFeatures> gl = new ArrayList<GlassFeatures>(Arrays.asList(new GlassFeatures(0, "Tesst")));
		LinkedList<GlassFeatures> gl = new LinkedList<GlassFeatures>(Arrays.asList(new GlassFeatures(0, "Tesst")));
//		Vector<GlassFeatures> gl = new Vector<GlassFeatures>(Arrays.asList(new GlassFeatures(0, "Tesst")));
		GlassFeatures gg = new GlassFeatures(3, "BLue Lens");

		gl.add(new GlassFeatures(1, "Dual Color"));
		gl.add(new GlassFeatures(2, "PH color"));
		gl.add(gg);
//		gl.addElement(gg);
		gg.setFeature("change");
//		gl.addLast(gg);
//		gl.removeLast();

		 gl.forEach((n) -> System.out.println(n));
		
		for (GlassFeatures f : gl) {
			System.out.println("ID:" + f.getId());
			System.out.println("Features:" + f.getFeature());
		}
	}
}
