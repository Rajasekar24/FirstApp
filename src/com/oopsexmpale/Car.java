package com.oopsexmpale;

public class Car implements Vehicle, FourWheel {

	@Override
	public void fourTyres() {
		// TODO Auto-generated method stub
		System.out.println("Four Wheels");

	}

	@Override
	
	public String name(String aa) {
		return aa;
	}

	public static void main(String[] args) {

		Car c = new Car();
		c.fourTyres();
		System.out.println(c.name("B&W"));
	}

}
