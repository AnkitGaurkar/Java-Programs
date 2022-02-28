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
