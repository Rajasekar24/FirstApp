package com.arraylist;

public class GlassFeatures {
	private int id;
	private String feature;
	
	
	public GlassFeatures(int id, String feature) {
		super();
		this.id = id;
		this.feature = feature;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFeature() {
		return feature;
	}
	public void setFeature(String feature) {
		this.feature = feature;
	}
	@Override
	public String toString() {
		return "GlassFeatures [id=" + id + ", feature=" + feature + "]";
	}
	
	
}
