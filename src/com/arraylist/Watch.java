package com.arraylist;


public class Watch {
	private String brand, model, color;
	private int hands, buttons;
	private float size;
	public Watch(String brand, String model, String color, int hands, int buttons, float size) {
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.hands = hands;
		this.buttons = buttons;
		this.size = size;
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
	@Override
	public String toString() {
		return "Watch [brand=" + brand + ", model=" + model + ", color=" + color + ", hands=" + hands + ", buttons="
				+ buttons + ", size=" + size + "]";
	}


}
