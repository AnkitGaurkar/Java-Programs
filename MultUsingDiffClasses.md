# Java-Programs

package com;

import com.Welcome.Hello;

public class Welcome implements Runnable {
	
	public Welcome()
	{
	}
	public void run()
	
	{
		for(int i=0;i<10;i++)
		{
		System.out.println("welcome");
		
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	}
	 static class Hello extends Thread
	{
		public Hello()
		{
		}
		public void run()
		{
			for(int i=0;i<10;i++)
			{
			System.out.println("hello");
		
			try
			{
				sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			}
		
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Hello h=new Hello();
		h.start();
		
		Welcome w=new Welcome();
		Thread t=new Thread(w);
		t.start();
	}
	}
}



	
