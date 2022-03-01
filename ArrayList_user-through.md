# Java-Programs

package com;

import java.util.ArrayList;
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CourseList cl=new CourseList();
		ArrayList<String>resultedlist=cl.acceptCourses();
		System.out.println(resultedlist);
	}

}
