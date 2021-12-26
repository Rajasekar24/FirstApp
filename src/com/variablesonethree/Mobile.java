package com.variablesonethree;

import java.util.Arrays;

public class Mobile {
	private int id, memory;
	private String brand, model;
	private float price;
	private Camera[] cameras;

	public Mobile(int id, int memory, String brand, String model, float price, Camera[] cameras) {
		super();
		this.id = id;
		this.memory = memory;
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.cameras = cameras;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Camera[] getCameras() {
		return cameras;
	}

	public void setCameras(Camera[] cameras) {
		this.cameras = cameras;
	}

//	@Override
//	public String toString() {
//		return "Mobile [id=" + id + ", memory=" + memory + ", brand=" + brand + ", model=" + model + ", price=" + price
//				+ ", \n cameras=" + Arrays.toString(cameras) + "]";
//	}

}
