package com.collectionsWatch;

import java.util.Arrays;

public class Watch {
	private String brand, model, color;
	private int hands, buttons;
	private float size;
	private boolean isBattery, isRechagreble, isWaterProof;
	private Feature Features;

	public Watch(String brand, String model, String color, int hands, int buttons, float size, boolean isBattery,
			boolean isRechagreble, boolean isWaterProof, Feature fea) {
		super();
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.hands = hands;
		this.buttons = buttons;
		this.size = size;
		this.isBattery = isBattery;
		this.isRechagreble = isRechagreble;
		this.isWaterProof = isWaterProof;
		this.Features = fea;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getHands() {
		return hands;
	}

	public void setHands(int hands) {
		this.hands = hands;
	}

	public int getButtons() {
		return buttons;
	}

	public void setButtons(int buttons) {
		this.buttons = buttons;
	}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}

	public boolean isBattery() {
		return isBattery;
	}

	public void setBattery(boolean isBattery) {
		this.isBattery = isBattery;
	}

	public boolean isRechagreble() {
		return isRechagreble;
	}

	public void setRechagreble(boolean isRechagreble) {
		this.isRechagreble = isRechagreble;
	}

	public boolean isWaterProof() {
		return isWaterProof;
	}

	public void setWaterProof(boolean isWaterProof) {
		this.isWaterProof = isWaterProof;
	}

	public Feature getFeatures() {
		return Features;
	}

	public void setFeatures(Feature features) {
		Features = features;
	}

	@Override
	public String toString() {
		return "Watch [brand=" + brand + ", model=" + model + ", color=" + color + ", hands=" + hands + ", buttons="
				+ buttons + ", size=" + size + ", isBattery=" + isBattery + ", isRechagreble=" + isRechagreble
				+ ", isWaterProof=" + isWaterProof + ", Features=" + Features + "]";
	}

}
