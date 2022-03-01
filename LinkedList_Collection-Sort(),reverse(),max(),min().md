# Java-Programs

package com;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {4,5,8,6,3,2,7,9,3,6};
		
		LinkedList<Integer>l1=new LinkedList<Integer>();
		
		for(int ele:arr)
	{
			l1.add(ele);
		}
			//System.out.println(l1);
			Collections.sort(l1);
			//Collections.reverse(l1);
			System.out.println(l1);
			
			System.out.println("Max="+Collections.max(l1));
			System.out.println("Min="+Collections.min(l1));
		}
	}


