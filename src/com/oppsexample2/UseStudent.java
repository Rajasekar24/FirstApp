package com.oppsexample2;

public class UseStudent {
	static Student getSomeStudent(int a) {
		if (a == 0) {
			return new Student();
		} else if (a == 1) {
			return new EnggStudent();
		} else {
			return new Student();
		}
	}

	public static void main(String[] args) {
		Student s = new Student();
//		s.read();
//		s.play();

		EnggStudent e = new EnggStudent();
//		e.read();
//		e.play();
//		e.doLabResearch();
//
//		Student se = new EnggStudent();
//		se.read();
//		se.play();
//
//		Student s3 = getSomeStudent(1);
//		s3.read();
//
//		System.out.println(s instanceof EnggStudent ? "True" : "False");

//		studentUtil u = new studentUtil();
//		Object o = new Object();
//		u.getScore(o);
//		u.getScore(e);
//		u.getScore(s);
//		u.getScore(t);

//		Pass by ref		
		Teacher t = new Teacher();
		t.id = 1;
		t.id++;
		System.out.println(t.id);
		adder(t);
		System.out.println(t.id);

		// Pa     ss by val
		int c = 1;
		System.out.println("c" + c);
		checker(c);
		System.out.println(c);
	}

	static void adder(Teacher tt) {
		System.out.println("in method : " + tt.id);
		tt.id++;
		System.out.println("in method : " + tt.id);
	}

	static void checker(int cc) {
		cc++;
		System.out.println(cc);
	}
}
