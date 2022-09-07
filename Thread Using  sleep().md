# Java-Programs
package com;

 class MergeArr extends Thread
 
 {
	 public void run()
	 {
		 for(int i=0;i<=10;i++)
		 {
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println("Hello Ankit");
	 }
	 }
public static void main (String[] args)
{
	
	MergeArr a1=new MergeArr();
	a1.start();
}
}
