# Java-Programs
package com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Tut18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Object>l1=new ArrayList<Object>();
		
		l1.add("abc");
		l1.add(new Integer(5));
		l1.add(new Character('r'));
		l1.add(new Float(7.8));
		
		System.out.println(l1);
		
		l1.remove(new Integer(5));
		System.out.println(l1);
		
		LinkedList l=new LinkedList();
		l.add("e");
		l.add("ab");
		l.add(new Character('o'));
		
		System.out.println(l);
		
		l.removeAll(l1);
		System.out.println(l);
		}

}

