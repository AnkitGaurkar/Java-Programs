# Java-Programs

package com;

class Outer
{
		static class Inner
		{
			void show()
			{
				System.out.println("Static nested classes");
				
			}
		}
		
}
public class Tut16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outer.Inner i1=new Outer.Inner();
		i1.show();
	}

}
