# Java-Programs

package com;

import java.util.Scanner;

public class NameApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter any name");
			String name=sc.next();
			
			for(int i=0;i<name.length();i++)
			{
				char ch=name.charAt(i);
				if(ch>='a' && ch<='z'||ch>='A'&& ch<='Z')
					
				{
					continue;
				}
				else
				{
					throw new InvalidNameExp();
				}
			}
			System.out.println(name);
		}
		catch(InvalidNameExp e)
		{
			e.printStackTrace();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
