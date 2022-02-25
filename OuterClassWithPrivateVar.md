# Java-Programs
package com;

class Outer
{
	private int a=5;
	void createInner()
	{
		class Inner
		{
			void show()
			{
				System.out.println("Outer class private var="+a);
			}
		}
		Inner i1=new Inner();
		i1.show();
	}
}
public class Tut14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outer o=new Outer();
		o.createInner();
	}

}

