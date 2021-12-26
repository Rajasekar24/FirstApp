package com.oops;

public class CASIO {
	public static void main(String[] args) {

		// CASIO
		Watch w1 = new Watch();
		w1.brand = "CASIO";
		w1.model = "MTP-4500";
		w1.buttons = 3;
		w1.color = "metal";
		w1.hands = 6;
		w1.isBattery = true;
		w1.isRechagreble = false;
		w1.isWaterProof = true;
		w1.size = 20.22f;

		System.out.println("---Watch---");
		System.out.println("Brand Name:        " + w1.brand);
		System.out.println("Model No:          " + w1.model);
		System.out.println("No of Buttons:     " + w1.buttons);
		System.out.println("Color:             " + w1.color);
		System.out.println("No of hands        " + w1.hands);
		System.out.println("Battery:           " + w1.isBattery);
		System.out.println("Rechargeblebattery:" + w1.isRechagreble);
		System.out.println("Water proof:       " + w1.isWaterProof);
		System.out.println("Watch size:        " + w1.size);

		System.out.println("---Working---");
		w1.moveasec(12.00f);
		w1.moveamin(10.00f);
		w1.moveahour(10.00f); 
		w1.buttonpress(1);
		
		Features f1 = new Features();
		f1.showDate = true;
		f1.stopwatch = true;
		f1.id = 1;

		// Features f2 = new Features();
		// f2.id = 2;
		// f2.stopwtach = true;

		Features ff[] = new Features[1];
		ff[0] = f1;
		// ff[1] = f2;
		w1.fea = ff;
		w1.showfeatures();
	}
}
