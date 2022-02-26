# Java-Programpackage com;

import java.util.Scanner;

public class CalcSquare {
	
	void sqr()  {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any no");
	double n=sc.nextInt();
	double sqr=Math.pow(n,2);
	System.out.println("sqr of "+n+"is"+sqr);
}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		CalcSquare c=new CalcSquare();
		c.sqr();       //need to handle the exception in main as sqr() have throw the exception
		               //but sqr() doesn't handle the exception
}
} s

