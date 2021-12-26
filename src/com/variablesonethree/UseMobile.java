package com.variablesonethree;

public class UseMobile {
	
	public void showMobile(Mobile m) {
//		System.out.println(m);
		System.out.println("ID :"+ m.getId());
		System.out.println("Brand :"+ m.getBrand());
		System.out.println("Model :"+ m.getModel());
		System.out.println("Memory :"+ m.getMemory());
		System.out.println("Price :"+ m.getPrice());
//		System.out.println("Brand :"+ m.getCameras());
		for(Camera c : m.getCameras()) {
			System.out.println("Location     :"+ c.getLocation());
			System.out.println("Digital Zoom :"+ c.getDigitalZoom());
			System.out.println("Optical Zoom :"+ c.getOpticalZoom());
//			System.out.println("Location      :"+ c.getLocation());
		}
		
	}
	public static void main(String[] args) {

		Camera c1 = new Camera(20, 20,20, "Front");
		Camera c2 = new Camera(48, 60,20, "Back");
		
		Camera[] cam1 = new Camera[] {c1,c2}; 
		
		Mobile m1 = new Mobile(1, 250, "Realme", "X30", 26000, cam1);
		
		// instatnce 2
		
		Mobile m2 = new Mobile(2, 250, "OnePlus", "Nord", 26000, cam1);
		
		
		
		
		UseMobile use = new UseMobile();
		use.showMobile(m1);
		use.showMobile(m2);
	}
}
