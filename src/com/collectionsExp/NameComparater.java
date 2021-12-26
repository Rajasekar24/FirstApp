package com.collectionsExp;

import java.util.Comparator;

public class NameComparater implements Comparator<Laptop> {

	@Override
	public int compare(Laptop o1, Laptop o2) {
		// TODO Auto-generated method stub
//		return o1.compareTo(o2);
		
		return o1.getLapName().hashCode() - o2.getLapName().hashCode();
	}
	

}
