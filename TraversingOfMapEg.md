# Java-Programs
package com;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class StudentMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashMap<Integer,String> studmap=new LinkedHashMap<>();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how Many Student ??");
		int no=sc.nextInt();
		
		for(int i=0;i<no;i++)
		{
			System.out.println("Enter Roll no");
			int rno=sc.nextInt();
			
			System.out.println("Enter Student Name");
			String sname=sc.next();
			
			studmap.put(rno, sname);
		}
		System.out.println(studmap);
		
		Set<Integer>set =studmap.keySet();
		
		Iterator<Integer>i1=set.iterator();
		while(i1.hasNext())
			{
			int key=i1.next();
			String value=studmap.get(key);
			
			System.out.println(key+"\t"+value);
			}
	}

}

