# Java-Programs

package com;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableTut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Integer,String>ht=new Hashtable<Integer,String>();
		ht.put(1, "a");
		ht.put(3, "b");
		ht.put(12,"c");
		ht.put(3, "d");
		System.out.println(ht);
	
		Enumeration<Integer>e1=ht.keys();
		while(e1.hasMoreElements())
		{
			int key=e1.nextElement();
			String value=ht.get(key);
			System.out.println(key+" "+value);	
		}
	
		Enumeration <String>e2=ht.elements();
		while(e2.hasMoreElements())
		{
			System.out.println(e2.nextElement());
			}
		
	}

}
