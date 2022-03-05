# Java-Programs

package com;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Tut24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer>a1=new ArrayList<Integer>();
		a1.add(102);
		a1.add(505);
		a1.add(452);
		
		LinkedHashMap<Integer,Object>ht=new LinkedHashMap<Integer,Object>();
		ht.put(2,a1);
		ht.put(4,304);
		ht.put(5,455);
		ht.put(3,123);
		
		System.out.println(ht);
				
	}

}
