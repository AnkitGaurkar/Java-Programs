# Java-Programs

package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CourseList {
	
	ArrayList<String>acceptCourses()
	{
		ArrayList<String>courses=new ArrayList<String>();
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of Courses");
		int no=sc.nextInt();
		
		for(int i=0;i<no;i++)
		{
			System.out.println("Enter Element");
			String course=sc.next();
			courses.add(course);
		}
		return courses;
		
	}
	void disp(ArrayList<String>courseList)
	{
		Iterator<String>i1=courseList.iterator();
		while(i1.hasNext())
		{
			String course=i1.next();
			char ch=course.charAt(0);
			
			if(ch>='a' && ch<='z')
			{
				int ch1=ch-32;
				course=course.replace(ch,(char)ch1); //down Casting
			}
			System.out.println(course);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CourseList cl=new CourseList();
		ArrayList<String>resuledList = cl.acceptCourses();
		System.out.println(resuledList);
		cl.disp(resuledList);
	}

}
