package com.cg.NIO;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Async {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path path =Paths.get("Msg.txt");
		
		try (AsynchronousFileChannel file= AsynchronousFileChannel.open(path, StandardOpenOption.READ))
		{
			ByteBuffer buffer = ByteBuffer.allocate(1024);
			file.read(buffer, 0,null, new CompletionHandler<Integer, Void>(){
				@Override
				public void completed(Integer result, Void attachment) {
					// TODO Auto-generated method stub
					buffer.flip();
					System.out.println("Read " + result + " Bytes");
					
					byte[] data = new byte[result];
					buffer.get(data);
					System.out.println("File content : " + new String(data));	
				}
				
				@Override
				public void failed(Throwable exc, Void attachment) {
					// TODO Auto-generated method stub
					System.err.println("Failed to read : " + exc.getMessage());
				}
			});
			Thread.sleep(2000);
		} catch (IOException |InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
