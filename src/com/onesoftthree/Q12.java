package com.onesoftthree;

public class Q12 {
public static void main(String[] args){
	boolean val = false;
	 String vals = val ? "true": "false";
	switch(vals){
	case "true" : {
		System.out.println("1");
		break;
	}
	case "false": {
		System.out.println("0");
		break;
	}
	default: {
		System.out.println("enter vaild inputs");
	}
	}
}
}
