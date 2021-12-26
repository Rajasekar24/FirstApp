package com.arraylist;

public class Bag {
	private String brand, madeIn, name, color;
	private int zipCount, bottleHolder, handle;
	private float size, capacity, prize;
	private boolean laptopCarry;

	public Bag(String brand, String madeIn, String name, String color, int zipCount, int bottleHolder, int handle,
			float size, float capacity, float prize, boolean laptopCarry) {
		super();
		this.brand = brand;
		this.madeIn = madeIn;
		this.name = name;
		this.color = color;
		this.zipCount = zipCount;
		this.bottleHolder = bottleHolder;
		this.handle = handle;
		this.size = size;
		this.capacity = capacity;
		this.prize = prize;
		this.laptopCarry = laptopCarry;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getMadeIn() {
		return madeIn;
	}

	public void setMadeIn(String madeIn) {
		this.madeIn = madeIn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getZipCount() {
		return zipCount;
	}

	public void setZipCount(int zipCount) {
		this.zipCount = zipCount;
	}

	public int getBottleHolder() {
		return bottleHolder;
	}

	public void setBottleHolder(int bottleHolder) {
		this.bottleHolder = bottleHolder;
	}

	public int getHandle() {
		return handle;
	}

	public void setHandle(int handle) {
		this.handle = handle;
	}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}

	public float getCapacity() {
		return capacity;
	}

	public void setCapacity(float capacity) {
		this.capacity = capacity;
	}

	public float getPrize() {
		return prize;
	}

	public void setPrize(float prize) {
		this.prize = prize;
	}

	public boolean isLaptopCarry() {
		return laptopCarry;
	}

	public void setLaptopCarry(boolean laptopCarry) {
		this.laptopCarry = laptopCarry;
	}

	@Override
	public String toString() {
		return "Bag [brand=" + brand + ", madeIn=" + madeIn + ", name=" + name + ", color=" + color + ", zipCount="
				+ zipCount + ", bottleHolder=" + bottleHolder + ", handle=" + handle + ", size=" + size + ", capacity="
				+ capacity + ", prize=" + prize + ", laptopCarry=" + laptopCarry + "]";
	}

}
