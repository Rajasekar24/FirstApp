package com.forloop3;

public class Q10 {
public static void main(String[] args) {
	int arr[] = {5,6,7,8,9,1}, small = 10;

	for(int a: arr){
		if(a < small){
			small = a;
		}
	}
	System.out.println(small);

}
}
