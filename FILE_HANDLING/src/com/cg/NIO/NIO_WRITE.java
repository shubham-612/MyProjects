package com.cg.NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NIO_WRITE {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Happy Diwali";
		String file = "Msg.txt";
		
		try {
			Files.writeString(Paths.get(file), s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("COntent is written");
		
	}

}
