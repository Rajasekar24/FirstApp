package com.collectionsExp;

public class Laptop implements Comparable<Laptop> {
	private int lapid, ramSize;
	private String lapName;

	public Laptop(int lapid, int ramSize, String lapName) {
		super();
		this.lapid = lapid;
		this.ramSize = ramSize;
		this.lapName = lapName;
 	}

	public int getLapid() {
		return lapid;
	}

	public void setLapid(int lapid) {
		this.lapid = lapid;
	}

	public int getRamSize() {
		return ramSize;
	}

	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}

	public String getLapName() {
		return lapName;
	}

	public void setLapName(String lapName) {
		this.lapName = lapName;
	}

	@Override
	public int compareTo(Laptop s) {
//		return this.lapid - s.lapid;
//		return  s.lapid - this.lapid;
		return this.lapName.compareTo(s.lapName);
	}

	@Override
	public String toString() {
		return "Laptop [lapid=" + lapid + ", ramSize=" + ramSize + ", lapName=" + lapName + "]";
	}

}
