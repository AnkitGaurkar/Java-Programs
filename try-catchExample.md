# Java-Programs

package com;

import java.util.Scanner;

public class CalcSquare {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no");
		double n=sc.nextInt();
		double sqr=Math.pow(n,2);
		System.out.println("sqr of "+n+"is"+sqr);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
		System.out.println("plzz enter any no value");
	}

}
