package com.oops3;

public class Bags extends Container {
	String brand, madeIn, name, color;
	int zipCount, bottleHolder, handle;
	float size, capacity, prize;
	boolean laptopCarry;

	BagFeatures[] features;

	void zipClose(int id) {
		System.out.println("zip close for " + id);
	}

	void zipOpen(int id) {
		System.out.println("zip open for " + id);
	}

	void showfeatures() {
		System.out.println("---Bags Feature---");
		for (int i = 0; i < features.length; i++) {
			System.out.println("Id:" + features[i].id);
			System.out.println(features[i].feature);
		}
	}
}
