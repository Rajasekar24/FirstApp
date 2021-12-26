package com.oopsexmpale;

public class Testing {
	public static void main(String[] args) {
		 String regex = "([a-z])([A-Z]+)";
	        String replacement = "$1_$2";
	        System.out.println("CamelCaseToSomethingElse"
	                           .replaceAll(regex, replacement)
	                           .toLowerCase());
	}
}
