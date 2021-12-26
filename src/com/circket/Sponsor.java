package com.circket;

public class Sponsor {

	private String brand, business;
	private int locations, amount;
	private boolean title;

	public Sponsor(String brand, String business, int locations, int amount, boolean title) {

		this.brand = brand;
		this.business = business;
		this.locations = locations;
		this.amount = amount;
		this.title = title;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBusiness() {
		return business;
	}

	public void setBusiness(String business) {
		this.business = business;
	}

	public int getLocations() {
		return locations;
	}

	public void setLocations(int locations) {
		this.locations = locations;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public boolean isTitle() {
		return title;
	}

	public void setTitle(boolean title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Sponsor [brand=" + brand + ", business=" + business + ", locations=" + locations + ", amount=" + amount
				+ ", title=" + title + "]";
	}
	

}
