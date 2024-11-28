package com.cg.fh;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class File_Read {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis= null;
		BufferedInputStream bis = null;
		File f = new File("C:\\write.txt");
		try {
			fis = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		bis = new BufferedInputStream(fis);
		
		try {
			while(bis.available()>0)
			{
			System.out.print((char)bis.read());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				bis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
