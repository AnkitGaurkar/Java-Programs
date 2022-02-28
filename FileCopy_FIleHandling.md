# Java-Programs
package com;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f1=new File("C:\\Users\\Hi\\Desktop\\Ankit.txt");
		File f2=new File("C:\\Users\\Hi\\Desktop\\CopyOfAnkit.txt");
		
		FileReader fr=new FileReader(f1);
		FileWriter fw=new FileWriter(f2);
		
		int i=0;
		while((i=fr.read()) !=-1)
		{
			fw.write(i);
		}
		fr.close();
		fw.close();
		
		System.out.println("Successs");
		
	}

}

