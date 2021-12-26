package com.oopsexmpale;

public class Mobile {

	protected int model;
	
	public Mobile() {
		System.out.println("def");
	}

	public Mobile(int model) {
		this.model = model;
	}

	protected void setModel(int model) {
		this.model = model;
	}

	public int getModel() {
		return model;
	}
	

	public static void main(String[] args){
		
		Mobile m1 = new Mobile(123);
		System.out.println(m1.getModel());
		
		
		Mobile m2 = new Mobile();
		m2.setModel(4566);
		System.out.println(m2.getModel());
		
	}
}
