package de.bowsi.IOUebung;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BytesLesen {
	
	public static void main(String[] args) {
		String datei = "bbytes.dat";
		
		InputStream streamIn = null;
		InputStream bufferIn = null;
		
		
		
		try {
			streamIn = new FileInputStream(datei);
			bufferIn = new BufferedInputStream(streamIn);
			
			int b = bufferIn.read();
			while(b != -1) {
				System.out.println(b); // Byte verarbeiten
				b = bufferIn.read();
			}		
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			if (bufferIn != null) {
				try {
					bufferIn.close(); // schlieﬂt auch "stream"
				} 
				catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
}
