# Java-Programs
package com;

interface inf1
{
	void add();
	
}
public class Tut15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		inf1 i1=new inf1()
				{
			public void add()
			{
				System.out.println("My class name is Unknown");
			}
				};
				System.out.println(i1.getClass());
				
				inf1 i2=new inf1()
						{
					public void add()
					{
						System.out.println("My classname is Unknown");
					}
						};
						System.out.println(i2.getClass());
	}
}


