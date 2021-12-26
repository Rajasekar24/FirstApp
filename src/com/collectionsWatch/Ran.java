package com.collectionsWatch;

import java.util.Random;

public class Ran {
	public static Random numGen = new Random();

	public static Integer RandNum() {
		int rand = Math.abs((100) + numGen.nextInt(100));

		return rand;
	}
}
