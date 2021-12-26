package com.oppsexample2;

public class studentUtil {
	void getScore(Object o) {
		System.out.println("object");
	}
void getScore(Student s) {
	System.out.println("student");
	
}
void getScore(EnggStudent e) {
	System.out.println("engg student");
//	System.out.println(e.doLabResearch());
}
void getScore(Teacher s) {
//	s.play();
	System.out.println("in Teacher");
}
}
