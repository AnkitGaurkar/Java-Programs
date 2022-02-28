# Java-Programs

package userexp;

import java.util.Scanner;

public class AgeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Age");
			int age=sc.nextInt();
			
			if(age<18)
			{
				throw new InvalidAgeExp();
				
			}
			System.out.println("age="+age);
		}
		catch(InvalidAgeExp a)
		{
			a.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
