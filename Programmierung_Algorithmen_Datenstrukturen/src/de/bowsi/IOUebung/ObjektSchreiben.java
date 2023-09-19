package de.bowsi.IOUebung;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.BufferedOutputStream;

public class ObjektSchreiben {
	
	public static void main(String[] args) throws IOException{
		
		Buch[] buecher = {
			new Buch("Java Lerntafel", 2.99),
			new Buch("Systemanalyse und -entwurf mit UML", 19.33),
			new Buch("Testbuch 001", 9.99)		
		};
		
		String datei = "buchObjekt.dat";
		
		OutputStream stream = new FileOutputStream(datei);
		OutputStream buffer = new BufferedOutputStream(stream);
		
		//Zusaetzlich schliessen wir an unseren bisherigen Strom einen ObjectOutputStream an:
		ObjectOutputStream out = new ObjectOutputStream(buffer);
		
		for(int i = 0; i < buecher.length; i++) {
			out.writeObject(buecher[i]);
		}
		
		out.close();
	}
	
	
}
