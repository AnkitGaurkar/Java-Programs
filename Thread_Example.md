# Java-Programs

package com;

public class Hello extends Thread
{
	public Hello()
	{
		
	}
	public void run()
	{
		System.out.println("hello");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hello h=new Hello();
		h.start();
	}

}


package com;


 class MergeArr extends Thread
 {
	 public void run()
	 {
		 System.out.println("hi");
	}
public static void main (String[] args)
{
	MergeArr m1=new MergeArr();
	m1.start();
}
	
}
