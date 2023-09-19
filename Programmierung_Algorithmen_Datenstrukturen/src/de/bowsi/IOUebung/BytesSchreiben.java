package de.bowsi.IOUebung;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class BytesSchreiben {
	
	public static void main(String[] args)
	{
		String datei = "bytes.dat";
		
		FileOutputStream stream = null;
		BufferedOutputStream buffer = null;
		
		try {
			stream = new FileOutputStream(datei);
			buffer = new BufferedOutputStream(stream);
			
			for(int i = 0; i <= 255; i++) {
				buffer.write(i);
			}
			
		} catch(Exception e) {
				e.printStackTrace();
		  }
		finally {
			  
		if(buffer != null) {
			try {
				buffer.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	
		}
		
		
	}
 
}
