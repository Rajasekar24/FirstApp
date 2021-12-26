package com.opps2;

public class Products {
	public static void main(String[] args) {

		// Titan
		Glass g1 = new Glass();
		g1.brand = "Titan";
		g1.color = "Black";
		g1.madeIn = "India";
		g1.size = 20.22f;
		g1.rightEyePower = 1.75f;
		g1.leftEyePower = 1.75f;
		g1.numberOfLens = 2;

		GlassFeatures f1 = new GlassFeatures();
		f1.id = 1;
		f1.feature = "Water Proof";
		GlassFeatures f2 = new GlassFeatures();
		f2.id = 2;
		f2.feature = "Lens color change on sun light";
		GlassFeatures f3 = new GlassFeatures();
		f3.id = 3;
		f3.feature = "matte finish";

		GlassFeatures arr[] = new GlassFeatures[3];
		arr[0] = f1;
		arr[1] = f2;
		arr[2] = f3;
		g1.features = arr;

		System.out.println("---Glass---");
		System.out.println("Brand Name:     " + g1.brand);
		System.out.println("Made In:        " + g1.madeIn);
		System.out.println("Color:          " + g1.color);
		System.out.println("Coolers:        " + g1.isCoolers);
		System.out.println("size:           " + g1.size);
		System.out.println("Right Eye Power:" + g1.rightEyePower);
		System.out.println("Left Eye Power: " + g1.leftEyePower);
		System.out.println("---Working---");
		g1.openSpecs();
		g1.closeSpecs();
		g1.showfeatures();
	}
}
