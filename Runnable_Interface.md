# Java-Programs


package runnableclasses;

public class RunnableClasses implements Runnable {
	
	public RunnableClasses()
	{
		
	}
public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("hello");
			
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RunnableClasses r=new RunnableClasses();	
		Thread t=new Thread(r); //born h1
		t.start(); // runnable
	}
	       }

package com;

 class MergeArr implements Runnable
 {
	 
public static void main (String[] args)
{
	MergeArr m1=new MergeArr();
	Thread t1=new Thread(m1);
	t1.start();
}

@Override
public void run() {
	// TODO Auto-generated method stub
	System.out.println("Hi");
}}

