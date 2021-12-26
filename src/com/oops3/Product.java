package com.oops3;

public class Product {
	public static void main(String[] args) {

		// Skybags
		Bags b1 = new Bags();
		b1.brand = "Sky Bags";
		b1.name = "BackBag";
		b1.madeIn = "India";
		b1.color = "Blue";
		b1.zipCount = 5;
		b1.bottleHolder = 1;
		b1.handle = 3;
		b1.size = 200f;
		b1.capacity = 35.00f;
		b1.prize = 3000.00f;
		b1.laptopCarry = true;

		BagFeatures f1 = new BagFeatures();
		f1.id = 1;
		f1.feature = "Water Proof";
		BagFeatures f2 = new BagFeatures();
		f2.id = 2;
		f2.feature = "Smart bag comes with PowerBank";
		BagFeatures f3 = new BagFeatures();
		f3.id = 3;
		f3.feature = "Back cushion";

		BagFeatures arr[] = new BagFeatures[3];
		arr[0] = f1;
		arr[1] = f2;
		arr[2] = f3;
		b1.features = arr;

		b1.parent();
		System.out.println("---Bag---");
		System.out.println("Brand Name:     " + b1.brand);
		System.out.println("Made In:        " + b1.madeIn);
		System.out.println("Color:          " + b1.color);
		System.out.println("No of zip:      " + b1.zipCount);
		System.out.println("size:           " + b1.size);
		System.out.println("capacity:       " + b1.capacity);
		System.out.println("laptopCarry:    " + b1.laptopCarry);
		System.out.println("size:           " + b1.size);
		System.out.println("bottle Holder:  " + b1.bottleHolder);
		System.out.println("handle for carrying bag: " + b1.handle);
		System.out.println("---Working---");
		b1.zipClose(2);
		b1.zipOpen(3);
		b1.showfeatures();
	}
}
