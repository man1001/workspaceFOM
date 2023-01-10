package marktplatz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.ArrayList;

public class Pkw implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/* Instanzvariablen (Eigenschaften des Pkw‘s) */
	private int id;
	private String marke;
	private String typ;
	private int baujahr;
	private int kmstand;
	private String farbe;
	private int preis;
	
	
	static String pathData = "pkw_data";
	static String pathChecksum = "pkw_data_checksum";
	
	
	
	// Globale Variable zum festlegen einheitlicher IDs
	public static int globalId = 1;
	
	/* Konstruktor mit Übergabewerten */
	
	public Pkw(String marke, String typ, int baujahr, int kmstand, String farbe, int preis) {
		this.id = globalId;
		this.marke = marke;
		this.typ = typ;
		this.baujahr = baujahr;
		this.kmstand = kmstand;
		this.farbe = farbe;
		this.preis = preis;
		
		globalId++;
	}
	
	/* Getter-Methoden (zum Abfragen von Daten) */
	
	public String getMarke() {
		return marke;
	}
	
	public String getTyp() {
		return typ;
	}
	
	public int getBaujahr() {
		return baujahr;
	}
	
	public int getKmStand() {
		return kmstand;
	}
	
	public String getFarbe() {
		return farbe;
	}
	
	public int getPreis() {
		return preis;
	}
	
	public int getId() {
		return id;
	}
	
	// statische Methode zum speichern eines ArrayList<Pkw> Objekts
	public static void saveDate(ArrayList<Pkw> pkw, String filePath) {
		try {
			MessageDigest shaDigest = MessageDigest.getInstance("SHA-256");
			
			FileOutputStream fos = new FileOutputStream(filePath);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			System.out.println("[!]Info: Save data...");
			oos.writeObject(pkw);
			System.out.println("[!]Info: data saved");
			
			String checksum = getFileChecksum(shaDigest, filePath);
			writeCheck(checksum);
			System.out.println("checksum: "+ checksum);
			oos.close();
		} catch (Exception e) {
			System.out.println("[!]Warnung: Hier ist etwas katastrophal schief gegangen");
		}

	}
	
	// Methode zum Laden eines ArrayList<Pkw> Objekts
	public static ArrayList<Pkw> loadData() {
		ArrayList<Pkw> output;
		try {
			MessageDigest shaDigest = MessageDigest.getInstance("SHA-256");
			
			// Get file input stream for reading file content
			FileInputStream fis = new FileInputStream(pathData);
			
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			if(readCheck().equals(getFileChecksum(shaDigest, pathData))) {
				System.out.println("[!]Info: Load data...");
				System.out.println("Checksumme: "+ getFileChecksum(shaDigest, pathData));
				
				 output = (ArrayList<Pkw>) ois.readObject();
				System.out.println("[!]Info: data loaded\n");
				ois.close();
				return output;
			} else {
				System.out.println("[!]Warnung: Checksumme fehlerhaft");
				output = new ArrayList<Pkw>();
			}
			

			
		} catch (Exception e) {
			// Erzeugt ein leeres ArrayList Objekt und gibt es als returnwert zurück
			System.out.println("[!]Warnung: Hier ist beim laden etwas katastrophal schief gegangen");
			output = new ArrayList<Pkw>();
		}
		return output;
	
	}
	
	
	// Methode zum schreiben eines Text files
	private static void writeCheck(String string) {
		try {
		FileWriter fw = new FileWriter(pathChecksum);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(string);
		bw.close();
		
		} catch (Exception e) {
			System.out.println("[!]Warnung: Fehler beim schreiben der Checksumme");
		}
	}
	
	// Methode zum lesen eines Text Files
	private static String readCheck() {
		String output;
		try {
			FileReader fr = new FileReader(pathChecksum);
			BufferedReader br = new BufferedReader(fr);
			
			output = br.readLine();
			
		} catch (Exception e) {
			System.out.println("[!]Warnung: Fehler beim lesen der Checksumme");
			output = "";
		}
		
		return output;
	}

	// Methode zum erstellen einer sha-256 Checksumme für ein übergebenes File
	private static String getFileChecksum(MessageDigest digest, String path) throws IOException{
		// Get file input stream for reading file content
		FileInputStream fis = new FileInputStream(path);
		
		// Create byte array to read data in chunks
		byte[] byteArray = new byte[1024];
		int bytesCount = 0;
		
		// Read file data and update in message digest
		while ((bytesCount = fis.read(byteArray)) != -1) {
			digest.update(byteArray, 0, bytesCount);
		}
		
		//close the stream
		fis.close();
		
		// Get the hash's bytes
		byte[] bytes = digest.digest();
		
		// This bytes[] has bytes in decimal format;
		// Convert it to hexadecimal format
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < bytes.length; i++) {
			sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
		}
		
		return sb.toString();
	}
	


}
