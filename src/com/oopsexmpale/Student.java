package com.oopsexmpale;

//import java.util.Arrays;

public class Student {

	private StudentArr[] array;
	

	 Student(StudentArr[] a) {
		array = a;
	}

	public StudentArr[] getArray() {
		System.out.println("---Student ARR---");
		return array;
	}


	// @Override
	// public String toString() {
	// return "Student [array=" + Arrays.toString(array) + "]";
	// }

	public static void main(String[] args) {
		
		
//		f1.id = 1;
//		f1.name = "S1";
//		StudentArr f2 = new StudentArr();
//		f2.id = 2;
//		f2.name = "S2";
//		StudentArr f3 = new StudentArr();
//		f3.id = 3;
//		f3.name = "S3";
		
		StudentArr f1 = new StudentArr(1, "Name1");
		StudentArr f2 = new StudentArr(2, "Name2");
		StudentArr f3 = new StudentArr(3, "Name3");

		// StudentArr[] array = {{"id" :1, "name" : "nameeee"}};
//		int q[]

		StudentArr arr[] = new StudentArr[3];
		arr[0] = f1;
		arr[1] = f2;
		arr[2] = f3;
		
		// System.out.println(arr[0].id);
		// StudentArr[] ay = arr;
		Student s = new Student(arr);
		
		StudentArr[] array = s.getArray();
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Id:" + array[i].id);
			System.out.println(array[i].name);
		}
	}

}
