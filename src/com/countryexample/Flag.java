package com.countryexample;

public class Flag {

	private Float size;
	private String colors, name;
	private int id;

	public Float getSize() {
		return size;
	}

	public void setSize(Float size) {
		this.size = size;
	}

	public String getColors() {
		return colors;
	}

	public void setColors(String colors) {
		this.colors = colors;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Flag [size=" + size + ", colors=" + colors + ", name=" + name
				+ ", id=" + id + "]";
	}

	public Flag(Float size, String colors, String name, int id) {
		super();
		this.size = size;
		this.colors = colors;
		this.name = name;
		this.id = id;
	}

}
