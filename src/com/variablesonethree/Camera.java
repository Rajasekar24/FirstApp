package com.variablesonethree;

public class Camera {

	private int pixels;
	private float opticalZoom, digitalZoom;
	private String location;

	public Camera(int pixels, float opticalZoom, float digitalZoom, String location) {
		super();
		this.pixels = pixels;
		this.opticalZoom = opticalZoom;
		this.digitalZoom = digitalZoom;
		this.location = location;
	}

	public int getPixels() {
		return pixels;
	}

	public void setPixels(int pixels) {
		this.pixels = pixels;
	}

	public float getOpticalZoom() {
		return opticalZoom;
	}

	public void setOpticalZoom(float opticalZoom) {
		this.opticalZoom = opticalZoom;
	}

	public float getDigitalZoom() {
		return digitalZoom;
	}

	public void setDigitalZoom(float digitalZoom) {
		this.digitalZoom = digitalZoom;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
