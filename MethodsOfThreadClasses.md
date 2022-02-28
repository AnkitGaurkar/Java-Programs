# Java-Programs

package com;

public class Hello2 extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hello2 h=new Hello2();
	
		System.out.println(h.getName());
		h.setName("mythread");
		
		System.out.println(h.getName());
		
		System.out.println(h.getId());
		h.setPriority(10);
		
		System.out.println(h.getPriority());
		
		System.out.println(h.isAlive());
		System.out.println(h.isInterrupted());
		
		System.out.println(h.getState());
		
		System.out.println(h.getThreadGroup());
		
		System.out.println(Thread.currentThread());
	}

}
