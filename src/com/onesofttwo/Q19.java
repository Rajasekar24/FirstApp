package com.onesofttwo;

public class Q19 {

	public static void main(String[] args){
		int sqft = 120;
		if(sqft < 180){
			System.out.println("1 Ton AC will be fine");
		} else if ((sqft > 180) && (sqft < 450) ){
			System.out.println("2 Ton AC will be fine");			
		} else {
			System.out.println("Ask Manger to help you on select");
		}
	}
}
