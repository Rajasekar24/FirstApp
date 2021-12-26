package com.opps2;

public class Glass extends PersonLooks {
	String brand, madeIn, color;
	float size, rightEyePower, leftEyePower;
	int numberOfLens;
	GlassFeatures[] features;
	boolean isCoolers;

	// boolean isWaterProof;

	void openSpecs() {
		System.out.println("open Specs");
	}

	void closeSpecs() {
		System.out.println("close Specs");
	}

	void showfeatures() {
		System.out.println("---Glass Feature---");
		for (int i = 0; i < features.length; i++) {
			System.out.println("Id:" + features[i].id);
			System.out.println(features[i].feature);
		}

	}

}
