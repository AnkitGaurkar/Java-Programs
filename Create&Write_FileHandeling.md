# Java-Programs

package com;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		  File f1=new File("C:\\Users\\Hi\\Desktop\\Ankit.txt");
		 
		/*
		 * 
		 * FileWriter fw=new FileWriter(f1);
		
		String str="Welcome again to File Handling";
		
		fw.write(str);
		fw.close();
	*/
   
		FileOutputStream fout=new FileOutputStream(f1);
		
		String str="Welcome to file Handling";
		byte b[]=str.getBytes();
		fout.write(b);
		fout.close();
		
	System.out.println("Success");
}
}

