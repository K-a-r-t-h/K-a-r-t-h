package com.excepcation;

import java.io.*;

public class exception {

	public static void main(String[] args) {
		File f=null;
		FileWriter fw=null;
		BufferedWriter bw=null;
		try {
			f=new File("d:/karthik.txt");
			fw=new FileWriter(f);
			bw=new BufferedWriter(fw);
			bw.write("hello this is my file");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				bw.close();
				fw.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
			
		

	}
}
