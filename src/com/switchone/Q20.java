package com.switchone;

import java.util.Scanner;

public class Q20 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String river = s.next();
		switch(river){
		case "Ganga": {
			System.out.println("Varanasi, Patna, Haridwar and Kanpur");
			break;
		}
		case "Yamuna": {
			System.out.println("Delhi and Agra");
			break;
		}
		case "Brahmaputra": {
			System.out.println("Guwahati");
			break;
		}
		case "Narmada": {
			System.out.println("Jabalpur and Bharuch");
			break;
		}
		default : {
			System.out.println("Ask help!!");
		}
		}
	}
}
