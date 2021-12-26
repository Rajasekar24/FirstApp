package com.collectionsExp;

import java.util.Comparator;

public class SizeComparator implements Comparator<Laptop> {

	@Override
	public int compare(Laptop o1, Laptop o2) {
		// TODO Auto-generated method stub
		return o1.getRamSize() - o2.getRamSize();
	}

}
