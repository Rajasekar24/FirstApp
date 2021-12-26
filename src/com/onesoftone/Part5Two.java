package com.onesoftone;

public class Part5Two {
	public static void main(String[] args) {
		int rameskAge = 10, sureshAge = 50, rajeshAge = 7;

		if ((rameskAge < sureshAge) && (rameskAge < rajeshAge)) {
			System.out.println("Ramesh is younger");
		} else if ((sureshAge < rajeshAge) && (sureshAge < rameskAge)) {
			System.out.println("Suresh is younger");
		} else {
			System.out.println("Rajesh is younger");
		}
	}

}
