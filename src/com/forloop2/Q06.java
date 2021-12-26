package com.forloop2;

public class Q06 {
	public static void main(String[] args) {
		String val = "onesoft technologies";
		String arr[] = val.split("");
		for (int i = 0; i <arr.length; i++) {
			if(arr[i].equalsIgnoreCase(" ")){
				System.out.println("Found a space");
				break;
			} else if (((arr[i].equalsIgnoreCase("a")) || (arr[i].equalsIgnoreCase("e"))
					|| (arr[i].equalsIgnoreCase("i"))
					|| arr[i].equalsIgnoreCase("u") || arr[i].equalsIgnoreCase("o"))) {
				System.out.println(arr[i]);
			}
		}
	}
}
