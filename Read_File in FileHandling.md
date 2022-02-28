# Java-Programs
package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f1=new File("C:\\Users\\Hi\\Desktop\\Ankit.txt");
		
		FileInputStream fin=new FileInputStream(f1);
		
		int i=0;
		while((i=fin.read()) != -1)
		{
			System.out.print((char) i); //int to char i > char narrowing is explicit
		}
		fin.close();
	}

}

