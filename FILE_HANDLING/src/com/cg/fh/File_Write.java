package com.cg.fh;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_Write {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos= null;
		
		String str = "Shubham";
		
		File f = new File("C:\\write.txt");
		
		
		try 
		{
			fos = new FileOutputStream(f);
		} 
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// check whether file is present or not
		if(!f.exists())
		{
			try {
				System.out.println("File not found.");
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// CONVERT CHAR ARRAY TO BYTE ARRAY
		byte[] b = str.getBytes();
		
		try {
			System.out.println("File found.");
			fos.write(b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// write all content to file(push)
		try {
			fos.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
