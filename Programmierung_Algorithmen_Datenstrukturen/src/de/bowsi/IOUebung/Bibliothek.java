package de.bowsi.IOUebung;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class Bibliothek{
	
	public Bibliothek() {
		
	}

	
	public List<Buch> readBuchObject(){
		
		List<Buch> buecherObjekte = new ArrayList<>();
		
		InputStream stream = null;
		InputStream buffer = null;		
		ObjectInputStream in = null;
		
		try {
			stream = new FileInputStream("buchObjekt.dat");
			buffer = new BufferedInputStream(stream);			
			in = new ObjectInputStream(buffer);

			
			try {
			while(true) {

				Buch buch = (Buch) in.readObject();
				buecherObjekte.add(buch);
			}
			}catch(EOFException ex) {
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(in != null) {
					in.close();
				}else {
					System.out.println("Fehler beim lesen der Datei");
				}
			}catch(Exception e) {
				e.printStackTrace();
			}

		}
		return buecherObjekte;

	}
	
	public void printList(List<Buch> buecher) {
		for(int i = 0; i < buecher.size(); i++) {
			buecher.get(i).getPreis();
			buecher.getClass();
			System.out.println(buecher.get(i).getTitel());
			System.out.println(buecher.get(i).getPreis());
			System.out.println("----");
		}
	}

}
