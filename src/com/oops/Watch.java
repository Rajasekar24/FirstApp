package com.oops;

public class Watch extends Clock {
	String brand, model, color;
	int hands, buttons;
	float size;
	boolean isBattery, isRechagreble, isWaterProof;
	Features[] fea;

	void moveasec(float sec) {
		System.out.println("Moving a sec :" + sec);
	}

	void moveamin(float min) {
		System.out.println("Moving a min :" + min);
	}

	void moveahour(float mins) {
		System.out.println("Moving a Hour :" + mins);
	}

	void buttonpress(int id) {
		System.out.println(id + " button pressed");
	}

	void showfeatures() {
		System.out.println("---Watch Feature---");
		System.out.println("ID:" + fea[0].id);
		System.out.println("Show Date:" + fea[0].showDate);
		System.out.println("Stop Watch:" + fea[0].stopwatch);
		System.out.println("Digital Watch:" + fea[0].isdigital);
		System.out.println("E-SIM:" + fea[0].isesim);
		System.out.println("Speaker:" + fea[0].isspeaker);
		System.out.println("Mic:" + fea[0].ismic);
		System.out.println("Bluetooth:" + fea[0].isbluetooth);
		System.out.println("HealthCare Hardware:" + fea[0].ishealthcare);
	}
}
