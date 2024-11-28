package com.cg.excep;

import java.io.File;
import java.util.Scanner;

public class FILE_NOT_FOUND {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File f= new File("output.txt");
			Scanner sc= new Scanner(f);
			//f.write("hi");
			while(sc.hasNextLine()) {
				System.out.println(sc.hasNextLine());
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
