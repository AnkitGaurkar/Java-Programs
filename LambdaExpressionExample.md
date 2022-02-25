# Java-Programs
package com;

interface Addition
{
	void add();
	
}
interface Greet
{
	String sayHello(String msg);
}
interface Substraction
{
	int sub(int a,int b);
}
public class LambdaTut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Addition a1=()->
		{
			int c=22+3;
			System.out.println("ans="+c);
		};
		a1.add();
		
		Greet g1=(msg)->
		{
			return msg;
		};
		String str=g1.sayHello("hello");
		System.out.println(str);
		
		Substraction s1=(a,b)->
		{
			int c=a-b;
			return c;
		};
		int ans=s1.sub(6, 3);
		System.out.println("sub="+ans);
	}

}

