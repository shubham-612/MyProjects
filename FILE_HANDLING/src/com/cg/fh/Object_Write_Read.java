package com.cg.fh;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Object_Write_Read {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] e = new Employee[2];
		e[0] = new Employee(1, "Shubham");
		e[1] = new Employee(2, "Soum");
		
		FileOutputStream fos = null;
		ObjectOutputStream obs= null;
		
		try {
			fos = new FileOutputStream("emp.txt");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			 obs = new ObjectOutputStream(fos);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		try {
			for(int i=0;i<e.length;i++)
			{
			obs.writeObject(e[i].toString());
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		finally {
			try {
				fos.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}

}
