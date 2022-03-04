# Java-Programs
package com;

import java.util.HashSet;

public class EgHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(33);
		hs.add(55);
		hs.add(32);
		hs.add(64);
		hs.add(64);//duplicate element are ignored
		hs.add(12);
		hs.add(99);
		System.out.println(hs);
		
		//output is unordered & unsorted
	}

}

