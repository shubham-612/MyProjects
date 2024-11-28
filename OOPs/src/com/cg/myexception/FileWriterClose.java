package com.cg.myexception;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriterClose {

	public static void main(String[] args) {
		String filePath ="text.txt";
		try(FileWriter writer = new FileWriter(filePath))
		{
			writer.write("Shubham");
			writer.write("Khandelwal");
			System.out.println("Written in output file");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("written in output file");
	}
}
