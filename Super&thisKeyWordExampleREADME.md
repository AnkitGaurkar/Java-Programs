# Java-Programs

package com;

 class Base
{
	 int a=3;
	 int b=4;
	 int c=a+b;
	 
	void disp()
	{
		
		
		System.out.println("I am Base");
	}
}
 class Derived extends Base
 
 {
	 int a=6;
	 void disp()
	 {
		 System.out.println(c);
		 System.out.println(super.a);
		 System.out.println(this.a);
		 System.out.println("I am Derived");
		 super.disp();
	 }
 }
public class Tut2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Derived t=new Derived();
		t.disp();
		
	}

}
