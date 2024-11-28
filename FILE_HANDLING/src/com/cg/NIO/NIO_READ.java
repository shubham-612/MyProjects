package com.cg.NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class NIO_READ {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String file = "Msg.txt";
		String content = Files.readString(Paths.get(file));
		//String append  = "Happy dusherra"; 
		//Files.writeString(Paths.get(file), append, StandardOpenOption.APPEND);
		System.out.println(content);
	}
}